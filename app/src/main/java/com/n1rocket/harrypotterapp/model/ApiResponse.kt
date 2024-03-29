package com.n1rocket.harrypotterapp.model

data class CharacterResponse(
    val name: String?,
    val image: String?
)

//{
//        "name": "Harry Potter",
//        "alternate_names": [],
//        "species": "human",
//        "gender": "male",
//        "house": "Gryffindor",
//        "dateOfBirth": "31-07-1980",
//        "yearOfBirth": 1980,
//        "wizard": true,
//        "ancestry": "half-blood",
//        "eyeColour": "green",
//        "hairColour": "black",
//        "wand": {
//            "wood": "holly",
//            "core": "phoenix feather",
//            "length": 11
//        },
//        "patronus": "stag",
//        "hogwartsStudent": true,
//        "hogwartsStaff": false,
//        "actor": "Daniel Radcliffe",
//        "alternate_actors": [],
//        "alive": true,
//        "image": "http://hp-api.herokuapp.com/images/harry.jpg"
//    }