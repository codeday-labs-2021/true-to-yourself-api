package com.truetoyourshelf.truetoyourselfapi.service.impl;

import com.truetoyourshelf.truetoyourselfapi.client.IDictionaryClient;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryRequest;
import com.truetoyourshelf.truetoyourselfapi.model.dictionary.DictionaryResponse;
import com.truetoyourshelf.truetoyourselfapi.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

@Service
public class DictionaryService implements IDictionaryService {

    private final IDictionaryClient dictionaryClient;
    private Object LinkedHashMap;

    @Autowired
    public DictionaryService(final IDictionaryClient dictionaryClient) {
        this.dictionaryClient = dictionaryClient;
    }

    @Override
    public DictionaryResponse extractData(DictionaryRequest dictionaryRequest) {
        ArrayList<?> fullResponse = dictionaryClient.retrieveSynonyms(dictionaryRequest.getEmotionInput(), dictionaryRequest.getApiKey());
        LinkedHashMap<?, ?> fullFirstResponse = (java.util.LinkedHashMap<?, ?>) ((LinkedHashMap)fullResponse.get(0)).get("meta");
        return convertResponseToDictonaryResponse(fullFirstResponse);
    }

    @Override
    public ArrayList<String> findSynonyms(DictionaryResponse dictionaryResponse) {
        ArrayList<String> synonyms = new ArrayList<>();
        dictionaryResponse.getSyns().forEach(index -> index.forEach(synonym -> synonyms.add(synonym)));
        return synonyms;
    }

    private DictionaryResponse convertResponseToDictonaryResponse(LinkedHashMap fullFirstResponse) {
        DictionaryResponse dictionaryResponse = new DictionaryResponse();
        dictionaryResponse.setId((String) fullFirstResponse.get("id"));
        dictionaryResponse.setSyns((ArrayList<ArrayList<String>>) fullFirstResponse.get("syns"));
        dictionaryResponse.setAnts((ArrayList<ArrayList<String>>) fullFirstResponse.get("ants"));
        dictionaryResponse.setOffensive((Boolean) fullFirstResponse.get("offensive"));
        return dictionaryResponse;
    }

}
