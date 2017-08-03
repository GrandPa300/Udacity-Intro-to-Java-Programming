## Summary:

- Optional Challenge: Implementing __The Photography Story__  

	* This project simulates a _photography shop_, which reads in sequence of operations and demonstrate photo assignments as the final result. 

	* A sequence of operations is read from [story.txt](https://github.com/GrandPa300/Udacity-Intro-to-Java-Programming/blob/master/story.txt), which contains all the actions of a store manager, such as hiring a photographer, distributing photo assignments, and demonstrating finished photos. Part of the operation sequence looks like below:
		```
		Photographer Danny
		Photographer Leslie
		5 a parrot
		2 a waterfall
		4 a mountain
		3 Paris
		GiveOutAssignments
		```
![classes](http://i.imgur.com/bXd146R.jpg)
	* `Manager` class has method to `hire`, `assign work`,`get priority of work`, and `display finished work`
	* `Photographer` class has method to `get work` and `take photo` based on the assignment description.
	* `Portfoilo` class is used to store and display all the completed work.
	* Final photo works are displayed 3 in a row with photographer's name:

<div align=center>
      <img src="http://i.imgur.com/cPEanz6.jpg"
         width="50%" height="50%" />
  </div>

 
 Photos courtesy of [Justin Black](http://www.justinblackphotos.com/world4.html)