

<h1>
  Semester 4 | Software Design Architechture | Final QAP
</h1>


### **Overview**

Design and implementation of a RESTful API for a single resource, employing the RepositoryRestResource design pattern taught in class. Subsequently, the API is subjected to local testing within a Docker container environment.


---

### **Entity Information**


| Entity Name  | Fields                                                               | Sample JSON                                                                    |
| :----------: | :------------------------------------------------------------------- | :----------------------------------------------------------------------------- | 
| Video_Games  | title(*String*) <br/> publisher(*String*) <br/> platforms(*String[]*)|{<br/>&emsp; "title": "Hades", <br/>&emsp; "publisher": "Supergiant Games", <br/>&emsp; "platforms": ["Nintendo Switch", "PlayStation 4", "PlayStation 5", "Xbox One", "Xbox Series X/S", "PC"] <br/> }                                            |

<!--  
Unformatted Data:
-----------------

Entity Name:    Video_Games 	

Fields:         title(String)
                publisher(String)
                platforms(String[]) 	

Sample JSON:    {
                  "title": "Hades",
                  "publisher": "Supergiant Games",
                  "platforms": ["Nintendo Switch", "PlayStation 4", "PlayStation 5", "Xbox One", "Xbox Series X/S", "PC"]
                } 
-->

---

### **Endpoints**

|              Method                | URI                                              | Query Parameter        |
| :--------------------------------: | :----------------------------------------------- | :--------------------- |
| **GET** (All)                      | localhost:8080/video_game                        |                        |
| **GET** (By ID)                    | localhost:8080/video_game/{id}                   |                        |
| **GET** (Find by Title)            | localhost:8080/video_game/search/findByTitle     | ?title=\<String>       |
| **GET** (Find by Publisher)        | localhost:8080/video_game/search/findByPublisher | ?title=\<String>       |
| **GET** (Find by Platforms)        | localhost:8080/video_game/search/findByPlatforms | ?title=\<String>       |
| **POST**                           | localhost:8080/video_game                        |                        |
| **PUT**                            | localhost:8080/video_game/{id}                   |                        |
| **DELETE**                         | localhost:8080/video_game/{id}                   |                        |

