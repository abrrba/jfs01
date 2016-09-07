##########
Login Page
##########

#. Page should be responsive. It should resize as per the screen size.
#. Their should be Username and password validations and proper error message should be shown as the user types in, besides the input box.
#. SignIn and SignUp buttons for respective actions.
#. Show password option for password fields.
#. SignUp button opens up a new View to enter user details and upon completion, redirects to the main page.
#. Signin and Signup, when landing on MainPage should display a Welcome ``username`` on top right.
#. Forgot password link which first validates the emailid and sends passowrd for only registred users. The users who are not registered, displays an error message stating the same.
#. The URL should not change while logging in and registering.
#. Main page should not be directly accessible by typing the url in the address bar.


#########
Main Page
#########

#. Page should be responsive. It should resize as per the screen size.
#. Logout and Cart buttons should be there.
#. Search bar to sreach for specific items.
#. Banner of images for offers.
#. Cart button shows a badge which tells the number of items in the cart.
#. Logout takes back to the login page, from where on clicking the ``back button`` of browser, should not take to Main page.
#. Tables of categories with images fetched from db and displayed.
#. Each category on clicking, takes to the product page and shows the items in a table, under it.

############
Product Page
############

#. Each product shows the price and the quantity avaiable.
#. Sorting option shpoould be there for :
        #. Names
        #. Price high-low
        #. Price low-high
#. Search as you type for products name and brands.
#. Add to cart for each product.
#. Cart badge value updated as a new product is added to the cart.

############
Payment Page
############

#. List the item from teh cart.
#. Gives the total price.
#. Takes the delivery address from user.
#. Gives estimated delivery time.
#. Place the order.
#. Confirmation mail to user with a unique tracking id.
