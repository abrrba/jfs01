################
Styling the Page
################

#.  Till now we have seen a very basic code to print simple plain text on the webpage.

#.  But it dosent look appealing on the part of user who would be viewing our website.

#.  We need to format the page by changing its look and feel.

#.  Let us start.

***************
Style attribute
***************

#.  To change the style of an HTML element, we use the style attribute, which has the following syntax.

``style="property:value"``

********
Headings
********

#.  In HTML, there are 6 heading tags, which change the size of the text, to make it
    look like a heading. 

#.  Different headings have different size format, as shown below.

.. literalinclude:: examples/example02.html
   :language: html
   :linenos:

#.  Example Link `example02`_

.. _example02: http://localhost/webonomics/doc/01_basic_html/examples/example02.html

#.  So we can change the the size of our first example by using ``<h1>`` tag and see the
    result.

.. literalinclude:: examples/example03.html
   :language: html
   :linenos:

#.  Example Link `example03`_

.. _example03: http://localhost/webonomics/doc/01_basic_html/examples/example03.html

*****************
Alignment of Text
*****************

#.  To change the alignment text, we use **text-align** property, which specifies
    the horizontal alignment of text.

**text-align: left|right|center|justify|initial|inherit**

Usage 1
*******

.. literalinclude:: examples/example04.html
   :language: html
   :linenos:

#.  Example Link `example04`_

.. _example04: http://localhost/webonomics/doc/01_basic_html/examples/example04.html

#.  Here we have specified seperately for each line. In case of repetitive work,
    this will not be efficient. 
#.  Let us look at a more smarter way to work on this.


Usage 2
*******

.. literalinclude:: examples/example05.html
   :language: html
   :linenos:

#.  Example Link `example05`_

.. _example05: http://localhost/webonomics/doc/01_basic_html/examples/example05.html

#.  This helps to define the proeprty of any tag, only once, and can be used any
    number of times.

*******
<p> Tag
*******

#.  ``<p>`` tag marks a paragraph. 
#. Browser automatically adds some space (margin) before and after ``<p>`` element. 
#. The margin can be  modified with CSS(with margin property).

#.  Below is the example to see the difference. 


.. literalinclude:: examples/example06.html
   :linenos:
   :language: html

#.  Example Link `example06`_

.. _example06: http://localhost/webonomics/doc/01_basic_html/examples/example06.html

********
<br> Tag
********

#.  In the above example we saw a tag ``<br>``. It is the line break tag, used to split
    a single line into two.

********
<hr> Tag
********

#.  The ``<hr>`` tag is the Horizontal Rule tag.
#.  It is used to insert a horizontal line in the page.
#.  A simple horizontal rule is inserted using ``<hr>`` tag as shown in above example.
#. We have formatted the HR by using different attributes 

#. ``width``            : to change the width of hr across the page.
#. ``height``           : to change the thickness of the line. Use px as unit.
#. ``size``             : this also is used to change the thickness of the lines. No unit required.
#. ``color``            : to give the border color.
#. ``background-color`` : to change the fill of the hr is size is more.

**************************************************
See the Color Palette in the file ColorPalette.png
**************************************************

***************
Body Background
***************

#.  The **background-color** property defines the background color of the page as
    shown in above example.

**********
Text Color
**********

#.  The **color** property defines the text-color of the element. In this example we
    have changed the color of **How** to blue.

****
Font
****

#.  We can change the font of the text by using the **font-family** attribute.
#.  The syntax


``style="font-family:Verdana"``

It is shown in above example.
