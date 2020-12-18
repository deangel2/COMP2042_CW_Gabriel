### Key Changes (Maintainence):

#### Moved classes into dedicated packages (improve organisation)

classes that was in 1 package originally was seperated into 3 deperate packages:
* Entity
* Logic
* Main

This was done to improve workability, and to help users understand which part of the code they are working on.

#### Moved resources into seperate package

Assets such as images and music files were moved into a single folder, and was then seperated into 4 categories:

* Entity
	Entity contains assets to be used in entity class such as cars, truck, logs, and turtles
* Music
	Music contains music file for use in background music
* Player
	Player contains player model and death animations
* World
	World contains assets such as background image and assets to show current score

This was done to improve legibility and improve workability of the document.

#### improved single responsibility in classes

From original code, methods were broken down into smaller specialised methods to improve understandability and making it easier to work with.
This adheres to Robert C. Martin's SOLID principles.

Such examples can be seen in main class:
* moving initialisaiotn of entities (_log_, _turtle_, _car_) into seperate method so start() method is more concise and clean
* move alert pop up to showNewAlert method to improve single responsibility

#### made commonly used values into static final

This is done so same and frequently used variables are not able to be modified.

Examples are in Animal class where _movement_, _movementX_, and _imgSize_ are made static final