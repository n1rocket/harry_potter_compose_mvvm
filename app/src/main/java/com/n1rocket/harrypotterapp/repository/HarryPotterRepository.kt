package com.n1rocket.harrypotterapp.repository

import androidx.lifecycle.LiveData
import com.n1rocket.harrypotterapp.datasource.RestDataSource
import com.n1rocket.harrypotterapp.model.CharacterDao
import com.n1rocket.harrypotterapp.model.CharacterHP

interface IHarryPotterRepository {
    suspend fun getAllCharactersFromHouse(house: String): LiveData<List<CharacterHP>>
}

class HarryPotterRepository(
    private val dataSource: RestDataSource,
    private val characterDao: CharacterDao
) : IHarryPotterRepository {
    override suspend fun getAllCharactersFromHouse(house: String): LiveData<List<CharacterHP>> {

        val responseFromServer = dataSource.getCharactersFromHouse(house)

        responseFromServer.results.forEach {
            characterDao.insert(CharacterHP(it.name ?: "", it.photo ?: ""))
        }
        
        return characterDao.getAll()
    }
}