## Amazing Products App
# By: Brandon Hampstead

Here is the [link](https://github.com/bham11/cs4520-assignment1) to the github repo with all of the code for this project 

Code should be able to be run through the normal 'run app' flow, for reference I used a Pixel 7 as 
my emulator when running this project.

A brief structure of the app is as followed:

* There is a MainActivity class that loads the Fragments into the Fragment manager. 
It uses a navigation graph to correctly load and navigate which Fragments when they are needed
* There is then the Login Fragment which pairs with ```res/layout/fragment_login.xml```
to render the username and login credentials and confirms navigation to the ProductListFragment page
* The ProductListFragment uses a RecyclerView to render each individual product, created by the Product Class
and rendered by ```res/laout/product_activity_row_layout.xml``` in the larger ConstrainedLayout RecyclerView located at 
```res/layout/product_activity_layout.xml```