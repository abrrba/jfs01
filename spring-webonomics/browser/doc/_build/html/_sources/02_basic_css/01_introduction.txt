#########
Basic CSS
#########

#.  This is an introduction to some basic CSS concepts which changes the look and
    feel of the page for the user.
#.  CSS stands for ``Cascading Style Sheet``.
#.  It describes how HTML Elements are to be displayed on the screen.
#.  External Style Sheets are stored in CSS files.

*************
CSS Selectors
*************

****************
Element Selector
****************

#.  It selects the element based on element name.

Syntax
******

.. code-block:: html
    
    p {
        color: red
    }

***********
ID Selector
***********

#.  It selects the element based on its ID. To select the specific id, use a hash
    **#** character followed by the id of the element.

Syntax
******

.. code-block:: html

   #id1 {
        color:red;
   }

**************
Class Selector
**************

#.  It selects the element based on the class specified.
#.  To select a class, use a dot **.** character followed by the name of the class.

Syntax
******

.. code-block:: html

   .class1 {
        color:red;
    }

#.  You can also specify that only certain HTML element with that class should be
    affected and not all the elements of that class as below :

.. code-block:: html

   p.class1 {
        color:red;
   }

#.  This will only change the text color of <p> element with class ``class1`` and 
    leave rest of the elements unchanged who have class as `class1`.

******************
Grouping Selectors
******************

#.  You can group the elements having same styles in a single group by using a comma
    **,** operator as below :

.. code-block:: html

   p, h1, h2 {
        color:red;
   }

************
CSS Comments
************

#.  To mark comments in CSS we use ``/* Comment */`` pattern
