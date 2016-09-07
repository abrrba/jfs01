############
Let Us Start
############

Let us start section wise and complete each of the requirements

#.  In the reference directory go to the ``06_main_page``.

#.  In the ``js`` directory you will have the ``make.js`` file.

.. note:: In this section you write the HTML part in the ``main_page.html`` file, the php for the ``get_category.php``, and the js for ``make_category_table()``.

**********
The Header
**********

As we will be using an external stylesheet to style our web page, we first need
to link that stylesheet to our Webpage using below :

.. code-block:: html

   <link rel="stylesheet" type="text/css" href="css/page.css">

Below is the code for the Main Page Header :

.. literalinclude:: main_page.html
   :language: html
   :lines: 31-53


First we need to make a ``<div>`` with class=header and then enclose all the code
for header inside this.

.. literalinclude:: css/page.css
   :language: css
   :lines: 52-55


#. We first create a seperate div for logo and include the logo using the ``<img>`` tag.

#. We have used a class ``logo`` which has below :

.. literalinclude:: css/page.css
   :language: css
   :lines: 56-60


#. Then we move to create the Search bar. To take input from User, we need a text box which is created using a ``<form>`` tag. Below is the code snippet.

.. literalinclude:: main_page.html
   :language: html
   :lines: 41-46

We have used a class ``search`` which has below:

.. literalinclude:: css/page.css
   :language: css
   :lines: 62-81

#. The ``action`` attribute in <form> specifies what page to load when the form is submitted.

#. To create the input box, use ``<input>`` tag as shown in above code.

``id`` --> Used when refering from any other element 

``type`` --> To specify what type of data will be there

``name`` --> Used to refer the element from other language code: php/Javascript

``placeholder`` --> Displays a default text in the inout box which is replaced by User input later

``size`` --> The length of the box

#. Next is the input for a submit button. We have replaced a typical submit button by an image of the serach to make it look more appealing. For Submit button, the ``type`` is ``image`` in this case, else it is ``submit``, and ``name`` is ``submit``.


#. Next we make the <div> for user name and Logout. The Logout link redirects the user to the Login Page. The code for the classes used are as below :

.. literalinclude:: main_page.html
   :language:html
   :lines:47-49,53-56

.. literalinclude:: css/page.css
   :language: css
   :lines: 82-103

#. As you can see in above code, the <div> for User Name has nothing written in it. Only the ``id`` is stated as ``member``. We are populating the UserName on page load using below code:

.. literalinclude:: main_page.html
   :language:html
   :lines:16-29

Here we extract the browser URL using the ``window.location.href`` command, split it and extract the user name. There is a check for this value to be ``undefined`` for the case of someone directly opens up this page. Next create a string to Welcome the User and set that string to ``innerHTML`` of the ``<div id=member``. Also we call the ``make_table()`` function from here to create the category table which we will see in some time.


************
Image slider
************

Here we will be creating a responsive Image Slider, which displays the current discounts and offers going on.

The code snippet is as below :

.. literalinclude:: main_page.html
   :language: html
   :lines: 61-77

Here we have used a pre-defined javascript ``jquery-2.2.0`` and ``jquery-cycle2`` which helps to make the slider. To use these javascripts we need to import two CSS files as below :

.. literalinclude:: main_page.html
   :language: html
   :lines: 11-12

After doing this, we will start with our Slider. For this we need to change few pre-defined classes in the above CSS.

#. First class is ``cycle-slideshow`` which forms the basis of the basic <div> for the slider. We change few attributes to make it as per our requirement.

.. literalinclude:: css/page.css
   :language: css
   :lines: 7-16

``max-width`` - Here used for responsive purpose. We can view the slider on smaller screens as well, without hampering the image.

``overflow`` - It specifies, what to do if the content exceeds it container size. If ``overflow`` property is set to ``scroll`` then a scroll bar appears in case of overflow of content.

``display`` - Specifies the type of box  used for HTML element. Setting it to ``block`` displays it like ``<p>``.

#. The next class is the ``cycle-prev`` and ``cycle-next``, which formats the arrow buttons used to navigate throught the slider for previous image and next image respectively.

.. literalinclude:: css/page.css
   :language: css
   :lines: 17-29

``z-index`` - Here we have mentioned the z-index property, which specifies the layer of the element. It has been set to ``9999`` so that it is always on the top.

``cursor`` - The cursor is set to ``pointer``, which displays a hand when you hover over the button.

``&#9001`` and ``&#9002`` - These are the Unicode values for the buttons to be a shape of the arrow.

#. Then, next class is the ``cycle-pager`` which actually holds the images for the slider.

.. literalinclude:: css/page.css
   :language: css
   :lines: 31-37

Images are inserted using the ``<img>`` tag discussed before.

************
Category Bar
************

Now we start with our category bar. The code snippet is as below:

.. literalinclude:: main_page.html
   :language: html
   :lines: 78-85


Here we have used a class ``section-heading`` to style the headings of each section. The code is as below:

.. literalinclude:: css/page.css
   :language: css
   :lines: 123-128

Next we have created another <div> with ``id=cat_table`` to create a table of all the categories stored in the database tables. The code for the class ``category_table`` is:

.. literalinclude:: css/page.css
   :language: css
   :lines: 139-145

The ``nth-child(even)`` - Changes the background color of all the even Rows in the Table.

Javascript
==========

As you can see there is no code written to retrive and display the categories on the page. This is because, the code for this section, is populated using Javascript.

We call a function ``make_table()`` when the web page is loaded, using javascript as discussed earlier.


The ``$(document).ready(function()`` is used to specify the functionalities which should be carried out at Page Load.

Now the ``make_table()`` function is written in javascript, which is a seperate file. So you all know, how to include that file in main_page.html :

.. literalinclude:: main_page.html
   :language: html
   :lines: 13-14

Now we will see the Javascript Code :

.. literalinclude:: js/make.js
   :language: javascript
   :lines: 1-26

#. Here as you can see, a PHP file is called, which actually fires the query to the database table and fetches all the categories. We will see the PHP code at a letr stage.

#. The PHP code, return the data in JSON format so, it is stored using

``jQuery.parseJSON(data)`` in ``result``.

#. Next we refer to the ``cat_table`` element og HTML, using ``document.getElementById`` function of javascript. The variable ``cat_table`` of javascript then refers to the HTML <div>.

#. There is a property of ``innerHTML`` which is used to set the content(inner HTML) of an element. We are using this property here to build the <div> for category table.

#. We then define a variable ``tbl`` to store the HTML tags, and then we build each row of the table using the data returned from PHP.

#. You can see that, while building the row variable, we have passed a variable as ``search=name``. It is done to pass the variable to the next page, so that we can use it there, by extracting it from the URL. Will discuss about it in detail when we create the product page.

#. In the end we build the content using ``cat_table.innerHTML``, and the table
is created on the main page.


PHP
===

Now we will see the PHP code, which actually fetches the data from MyZone database tables. Below is the code snippet:

.. literalinclude:: get_category.php
   :language: php
   :lines: 1-19

#. First we create a connection to the Database using ``PDO``. Enter the ``host``, ``database name``, ``username`` and ``password``.

#. Next we write the query to fetch all the categories from ``categories`` table.

#. FETCH_ASSOC return the result as an array, so it is easy to handle it. The result is returned to Javascrpt using ``json_encode``.

**********
The Footer
**********

Next we create a footer section which holds any extra information or data.

.. literalinclude:: main_page.html
   :language: html
   :lines: 84-89
