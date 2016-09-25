############
Let Us Start
############

Before starting the specific to the Login Page, we need to add a title to the
webpage.

.. code-block:: html

   <!DOCTYPE html>
   <html>
        <head>
                <title> Login Page - Myzone.in </title>
        </head>
   </html>

**********
The Header
**********

#.  We first add the ``<body>`` tag and add some color to it using an external CSS, which is embedded inside the HTML document using ``<link>``.

#. Add a ``<div>`` for header and give it a class name ``header``, so that we can style it as per our requirement. Give it also a background color.

#. We first add the <body> tag and add some color to it using an external CSS, which is embedded inside the HTML document using ``<link>``.

#. Add a ``<div>`` for header and give it a class name ``header``, so that we can style it as per our requirement. Give it also a background color.

#. Make margin of the body as ``0``, so that the div is aligned with the body tag.

#. Mention height and width of the header.

#. Place ``MyZone.in`` in the center.

#. Then we include the logo in the left

Below is the code :

.. literalinclude:: login.html
   :language: html
   :lines: 1-18

Corresponding CSS :

.. literalinclude:: login.css
   :language: css
   :lines: 1-26

***********
Login Block
***********

Here we create the Login block with text boxes, where user can insert the
Username and Password.

#. Create a ``<div>`` for the **login_block** and make it center align.
#. Insert the **Text Box** for ``username and password``.

Below is the code snippet:

.. literalinclude:: login.html
   :language: html
   :lines: 20-37

Corresponding CSS :

.. literalinclude:: login.css
   :language: css
   :lines: 28-30

``font-family`` - we have already discussed
``padding`` - It is the space inside something
``margin`` - It is the space outside something


***********************
Sign-In Sign-Up Buttons
***********************

Next we add the Sign-In and Sign-Up buttons, as below :

.. literalinclude:: login.html
   :language: html
   :lines: 31-36

CSS:

.. literalinclude:: login.css
   :language: css
   :lines: 42-49

``border-radius`` - It is used the curve the edges of a entity, here it was
**square**

**********
The Footer
**********

Now we will include the **Footer** at the end of page.

Code Snippet

.. literalinclude:: login.html
   :language: html
   :lines: 38-40

CSS:

.. literalinclude:: login.css
   :language: css
   :lines: 50-57
