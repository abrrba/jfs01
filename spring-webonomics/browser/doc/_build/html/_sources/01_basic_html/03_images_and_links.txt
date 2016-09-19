################
Images and Links
################

#.  We can add Images and Links in our web page to improve the look and feel of the WebPage.

******
Images
******

#.  The <img> tag is empty, it contains attributes only, and does not have a closing tag. 

#.  The src attribute specifies the URL of the image.

#.  The syntax is :

``<img src="url" alt="text">``

#.  **alt** attribute specifies the alternate text which will be displayed if the
    image is not displayed due to some error.

Width and Height
++++++++++++++++

#.  It specifies the width and height of the image. It is specified with the number of pixels.

Title
+++++

#.  This attribute helps to display a text when the mouse pointer is hovered over the image.

*****
Links
*****

#.  HTML links are hyperlinks. A hyperlink is a text or an image you can click to jump to another location outside of curremt page.

#. The syntax is 

``<a href="url"> Link Text/Image </a>``

#.  You can change the colors of links based on their current status, i.e. Unvisited, Visited, Hover, Active.

``a:link|visited|hover|active``

Target Attribute
++++++++++++++++

#. It specifies where to open the linked document.

#. Syntax is :

``<a href"url" target="_blank"> text </a>``

``target="_blank|_self|_parent|_top``

**************************
Internal Links - Bookmarks
**************************

#.  In HTML we can create bookmarks, which are also know as internal links, which
    are used to traverse to different location within the same page.

#.  For this, first we need to create an ID at the target element, and call that
    target using a **#** from the link.

#.  Below example handles all the above scenarios.

.. literalinclude:: examples/example07.html
    :linenos:
    :language: html

#.  Example Link `example07`_

.. _example07: http://localhost/webonomics/doc/01_basic_html/examples/example07.html
