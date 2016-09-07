############
Let Us Start
############

Let us start section wise and complete each of the requirements.

.. note:: Here you will write php, html and js for ``payment.html`` and ``payment.php``

Below is the code for the complete page:

.. literalinclude:: payment.html
   :language: html
   :lines: 1-85

Above code includes Javascript code as well with the HTML.

In the above code, first we create a ``<div>`` to display the Name, Price and
Quantity of the selected product. We are again using the ``innerHTML`` to
populate this <div>. The product name, price and quantity are extracted from the
window URL.


Next ``<form>`` is created to take User input to deliver the product. The first
three inputs as below :

.. literalinclude:: payment.html
   :language: html
   :lines: 55-57

You can see that ``type=hidden`` is mentioned. So we can not see these fields on
our web page. It is written this way so that we can use these values in our PHP
page.

Then there are simple form fields for user input.

Let us take a look over ``Contact Number`` field.

.. literalinclude:: payment.html
   :language: html
   :lines: 65-66

We are calling a javascript function ``validate_num()`` when the value in this
field is changed by ``onchange``. This function is written in the Javascript
file ``payment.js``.

.. literalinclude:: js/payment.js
   :language: Javascript
   :lines: 1-7

Next we will see the ``Quantity`` field.

.. literalinclude:: payment.html
   :language: html
   :lines: 71-72

Here we are calling two Javascript functions - ``check_quantity and calculate``,
which is written in this same HTML file under ``<script>`` tag.

On Submitting the form, the PHP code ``payment.php`` is called, which is stated
below.


===
PHP
===

Let us have a look over this code :

.. literalinclude:: payment.php
   :language: PHP
   :lines: 1-86

#. First we fetch the data from HTML form using ``$_POST``.

#. Next we have a check for the entered quantity, as it should not be greater
than available quantity.

#. Then we calculate the total price.

#. In line no 22, we are calculating a date which is +10 days than current
system date. This date is used to mention the Expected Delivery date to
customer.

#. Next we create a random-number, which is used to create a ``Reference-Id`` of
the Order Placed.

#. Below code, is used to draft a mail;

.. literalinclude:: payment.php
   :language: PHP
   :lines: 30-33

#. PHP has a ``mail()`` function which is used to send E-Mails.

#. Also we need to update the quantity in the database.

