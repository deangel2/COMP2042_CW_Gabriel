<h3> Key Changes (Maintainence):</h3>

<h4> Moved classes into dedicated packages (improve organisation)</h4>

classes that was in 1 package originally was seperated into 3 seperate packages:
* Entity
* Logic
* Main

This was done to improve workability, and to help users understand which part of the code they are working on.
<hr>
<h4> Moved resources into seperate package</h4>

Assets such as images and music files were moved into a single folder, and was then seperated into 4 categories:

* Entity
	<p>Entity contains assets to be used in entity class such as cars, truck, logs, and turtles
* Music
	<p>Music contains music file for use in background music
* Player
	<p>Player contains player model and death animations
* World
	<p>World contains assets such as background image and assets to show current score

This was done to improve legibility and improve workability of the document.
<hr>
<h4> Improved single responsibility in classes</h4>

From original code, methods were broken down into smaller specialised methods to improve understandability and making it easier to work with.
This adheres to Robert C. Martin's SOLID principles.

Such examples can be seen in main class:
* moving initialisaiotn of entities (_log_, _turtle_, _car_) into seperate method so start() method is more concise and clean
* move alert pop up to _showNewAlert_ method to improve single responsibility
<hr>
<h4> Made commonly used values into static final</h4>

This is done so same and frequently used variables are not able to be modified.

Examples are in Animal class where _movement_, _movementX_, and _imgSize_ are made static final
<p>
<hr>
<h4>Other Materials</h4>
<b>Github Screenshot</b>
<p>Screenshot of Github usage is included in _Github Use_ Folder
<p>
<b>Javadoc</b>
To view Javadoc, open index.html in _javadoc_ folder

