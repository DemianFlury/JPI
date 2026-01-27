# Work Journal

Here I document my work, what I've done and in what timeframe. I also keep track of what still needs to be done. So organised and professional amirite?

## Timeline
| Project Start: 21.01.26             |
|:------------------------------------|
| Estimated Finishing time: 11.02.26  |


## Work packages


| Done | Title                   | Description                                                                                                              |  Estimated Time |
|:----:|:------------------------|--------------------------------------------------------------------------------------------------------------------------|----------------:|
| [ ]  | Inform thyself          | Look for information about Spring Boot, REST API, Eclipse/IntelliJ and set up environment / debugging                    |             2 h |
| [ ]  | Create Database         | Simple Database with a table for jokes and one for categories                                                            |           1.5 h |
| [ ]  | Populate DB             | Populate the database with some jokes of different categories                                                            |             1 h |
| [ ]  | Random Joke             | Fetch random Joke from the DB and send id, text and category via JSON                                                    |             1 h |
| [ ]  | Authentication          | Authentication via Password to mutate datasets                                                                           |             3 h |
| [ ]  | Update dataset          | Update a DB entry via API                                                                                                |           1.5 h |
| [ ]  | Delete dataset          | Delete a DB entry via API                                                                                                |           0.5 h |
| [ ]  | Add dataset             | Add a DB entry via API                                                                                                   |             1 h |
| [ ]  | Custom String injection | add an optional String parameter to the yo mama joke category, which replaces the "yo mama" in the joke with that string |             1 h |
|      | **TOTAL**               |                                                                                                                          |      **12.5 h** |

## Journal

### 21.01.26
I wrote some documentation and informed myself on a surface level. 
I made the work packages and probably completely whiffed on time estimations

### 22.01.26
Today I didn't have much time, so I just read some more about how APIs function and what I will need to make this work

### 23.01.26
I set up the project using Spring Initializr and installed IntelliJ IDEA, since I had already used PHPStorm and was a little more familiar with it than with Eclipse.

### 27.01.26
Today I searched for some Guides on the Internet and gathered more information. I followed a Tutorial to start getting set up with the first API calls. I had to disable the automatic DB connection for the program to run, since I don't yet have a DB. I added a List with a few Jokes, which can be accessed via the /joke?id=x URL.