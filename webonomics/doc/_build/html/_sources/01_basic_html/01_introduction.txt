############
Introduction
############

This is an introduction to some basic HTML tags which will help to start. 

We will write ``Hello World`` in this section.

*******************
DOCTYPE Declaration
*******************

#.  The ``<!DOCTYPE>`` declaration must be the first thing in any HTML document. 

#.  Do not confuse it it as a HTML tag. 

#.  It is an instruction to the web browser about what version of HTML the page is written.

#.  This declaration is not case senstive

``<!DOCTYPE html>``

*******************
Charset Declaration
*******************

To display an HTML page correctly, a web browser must know the character set
used in the page. UTF-8(Unicode) covers almost all of the characters and symbols
in the world. ``<meta>`` tag is used for this.

``<meta charset="UTF-8">``

***********************
Elements and Attributes
***********************

#.  ``Elements`` are written within a start tag, and an end tag, with the content in between.

``<tagname> content </tagname>`` 

#.  Some elements do not have an end tag, like ``<br>``, ``<hr>``.

#.  ``Attributes`` provide **additional information** about an element. 
#.  This is always specified in the **start tag**.
#.  Attributes come in ``name/value`` pairs like : ``name="value"``


********
HTML Tag
********

#.  The`` <html>`` tag tells the browser that this is an HTML document.
#.  It is the container of all other HTML elements.
#.  To end the ``<html> tag we put a **"\"** before the tag : ``</html>``

``<html> ..... </html>``


********
HEAD Tag
********

#.  The ``<head>`` element is a container for all the head elements.

#.  It can include a title for the document, scripts, styles, meta information, links and more.

#.  It is optional in case of HTML5 (if there are no scripts or styles or links).

``<head> ..... </head>``

*********
TITLE Tag
*********

#.  Every web page has a title which is shown in the window tab of browser. 
#.  ``<title>`` tag is used to define the same. 
#.  As mentioned above, it is enclosed within the ``<html>`` tag.

``<title> First Page </title>``

********
BODY Tag
********

#.  The ``<body>`` tag defines the documents body. 
#.  It contains all the text, images and data which needs to be displayed on the webpage.

#.  It also needs a closing tab to end the body section of the webpage.

#.  This tag is outside the ``<head>`` tag but inside ``<html>`` tag.

``<body> ......... </body>``

***************
Adding comments
***************

#.  It is very necessary to add comments in your code to imporove the readibility.
#.  Having comments in the code, make it easy to traverse through and understand the spicific on any code piece within.
#.  In HTML we add comments using ``<!-- Your Comments -->``


*********
Example 1
*********

#.  This is the code to have a page with **Hello World** 

.. literalinclude:: examples/example01.html
   :language: html
   :linenos:

#.  Example Link `example01`_

.. _example01: http://localhost/webonomics/doc/01_basic_html/examples/example01.html
