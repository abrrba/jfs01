################
Tables and Lists
################

#.  Tables and Lists in the document help to organize the data in a structured way.
#.  This increases the readibility of the text and ease to understand.
#.  HTML has ``<table>``, ``<ul>``, ``<ol>`` lists for the same.

Let us have a look :

******
Tables
******

#.  Tables are defines with ``<table>`` tag.
#.  It is divided into table rows with the ``<tr>`` tag. 
#.  Table rows are divided into table data with ``<td>`` tag.
#.  The table heading are given using   ``<th>`` tag.

Syntax
******

.. code-block:: html

    <table>
        <tr>
                <td>...</td>
                <td>...</td>
        </td>
    </table>


*****
Lists
*****

#.  There are following types of list -

#.  In Unordered List, the list item are marked with bullets.

Syntax
******

.. code-block:: html

    <ul>
          <li> ..</li>
          <li> ..</li.
    </ul>

#.  You can change the style of the bullet using **list-style-type** attribute -

``list-style-type:disc|circle|square|none``

#.  In Ordered List, the list items are marked using numbers.

Syntax
******

.. code-block:: html

    <ol>
          <li> ..</li>
          <li> ..</li.
    </ol>

#.  You can change the type using **type** attribute -

``type="1|A|a|I|i"``

#.  In Decription List, we have description of each of the item beside it.

Syntax
******

.. code-block:: html

    <dl>
          <dt> ..</dt>
          <dd> ........ </dd>
    </dl>

#.  ``<dt>`` specifies the description term and <dd> the description of that term

#.  Below is the code which shows all the above :

.. literalinclude:: examples/example08.html
    :language: html
    :emphasize-lines: 12,15-18
    :linenos:

#.  Example Link `example08`_

.. _example08: http://localhost/webonomics/doc/01_basic_html/examples/example08.html
