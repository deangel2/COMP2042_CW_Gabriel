<h3>How To Run Program:</h3>

<ol>
<li>Create new JavaFX project </li>
<dd>File -> New -> Other... -> JavaFX -> JavaFX Project</dd>
<p>
<li>Delete <i>Application</i> package in src folder</li>
<p>
<li>Import FroggerCW into project</li>
<p>
<dd>Right click project, Click <i>Import</i>, Click <i>File System</i> under Generals tab, Click <i>next</i>, Click <i>browse</i>, Navigate to FroggerCW folder, Click <i>Select Folder</i>, Click <i>Select All</i>, Click <i>Finish</i>, Click <i>Yes to All</i></dd>
<p>
<li>Right click project folder, under build path, Click <i>configure build path</i></li>
<p>
<li>Under Libraries tab, Make sure to have all JavaFX .jar file included </li>
<p>
<dd>If not, Click <i>Classpath</i>, Click <i>Add External JARs...</i>, Navigate to your javafx-sdk-11.0.2\lib folder, highlight and select all .jar file, Click <i>Open</i> </dd>
<p>
<li>Run <i>Main.java</i> once under src -> com.Frogger.Main. It should give an error.</li>
<p>
<li>Right Click <i>Main.java</i> file, under <i>Run As</i>, Click <i>Run Configurations...</i></li>
<p>
<li>Under Arguments tab, paste <i>--module-path C:\Users\laptop\eclipse\java-2020-09\eclipse\dropins\javafx-sdk-11.0.2\lib --add-modules=ALL-MODULE-PATH</i> into VM Argumetns</li>
<p>
<dd>Replace <i>C:\Users\laptop\eclipse\java-2020-09\eclipse\dropins\javafx-sdk-11.0.2\lib with your javafx-sdk-11.0.2</i> FilePath</dd>
<p>
<li>Right Click <i>Main.java</i>, under Run As, Click <i>Java Application</i></li>
</ol>

<hr>

<h3> Key Changes (Maintainence):</h3>

<h4> Moved classes into dedicated packages (improve organisation)</h4>

classes that was in 1 package originally was seperated into 3 seperate packages:
<ul>
	<li>Entity</li>
	<li>Logic</li>
	<li>Main</li>
</ul>
<i>This was done to improve workability, and to help users understand which part of the code they are working on.</i>
<hr>
<h4> Moved resources into seperate package</h4>

Assets such as images and music files were moved into a single folder, and was then seperated into 4 categories:

<ul>
	<li>Entity</li>
	<dd>-Entity contains assets to be used in entity class such as cars, truck, logs, and turtles
    </dd>
	<li>Music</li>
	<dd>-Music contains music file for use in background music</dd>
	<li>Player</li>
	<dd>-Player contains player model and death animations</dd>
	<li>World</li>
	<dd>-World contains assets such as background image and assets to show current score
    </dd>
</ul>
<i>This was done to improve legibility and improve workability of the document.</i>
<hr>
<h4> Improved single responsibility in classes</h4>

From original code, methods were broken down into smaller specialised methods to improve understandability and making it easier to work with.
<p>This adheres to Robert C. Martin's SOLID principles.

Such examples can be seen in main class:
<ul>
	<li>Moving initialisation of entities (<i>log</i>, <i>turtle</i>, <i>car</i>) into seperate method so start() method is more concise and clean</li>
	<li>Move alert pop up to <i>showNewAlert</i> method to improve single responsibility</li>
    </ul>
<hr>
<h4> Made commonly used values into static final</h4>

Examples are in Animal class where <i>movement</i>, <i>movementX</i>, and <i>imgSize</i> are made static final

<p><i>This is done so same and frequently used variables are not able to be modified.</i></p>

<p>
<hr>

<h4>Other Materials</h4>
<b>Changelog.txt</b>
<p>Changelog contains changes made in a specific working date</p>
<p></p>
<b>Github Screenshot</b>
<p>Screenshot of Github usage is included in <i>GitHub Use</i> Folder</p>
<p></p>
<b>Javadoc</b>
<p>To view Javadoc, open index.html in <i>javadoc</i> folder