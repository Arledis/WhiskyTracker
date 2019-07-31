# Lab

Given the basic code for classes and JpaRepositories for a whisky tracker, your task for this lab + homework is to complete the custom queries and connected them to appropriate RESTful endpoints.



**Whisky**

- `name` - the name of that individual whisky often uses the name of the distillery. An example is "The Glendronach - Revival" which is from "Glendronach" distillery
- `distillery` - the distillery object that it's related to
- `year` - the year edition that the whisky was released/ bottled. The year is not a way of determining the age.
- `age` - how long the whisky in the bottle was matured for before bottling

**Distillery**

- `name` - The name of the whisky distillery.
- `region` - The region of scotland where the whisky is from. These are one of either {**Lowlands**, **Speyside**, **Highlands**, **Islay**, **Campbeltown**, **Island** }
- `whiskys` - the list of related whiskies tracked against that distillery

## Task

**Custom Queries + REST** Write each of the following queries and connect them to an appropriate controller:

### MVP
  * Get all the whiskies for a particular year
  * Get all the distilleries for a particular region
  * Get all the whisky from a particular distillery that's a specific age
  
###  Extensions
  * Get all the whisky from a particular region 
  * Get distilleries that have whiskies that are 12 years old 



## Tips
* *"get all the whiskies for a particular year"* query *can* be done as a Spring Data JPA Method Query or using a Criteria Query.
* *"get all the distilleries for a particular region"* query *can* be done as a Spring Data JPA Method Query or using a Criteria Query.
* It's reccomended to use `id`s for queries that need other objects as part of the query.
* The other queries may need Criteria Queries to complete them, and might also need an `alias`.
* To stop your custom routes recursively referencing each other's properties, you will need a `@JsonIgnoreProperties("some_property_you_need_to_ignore")` annotation on related properties.

