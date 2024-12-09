# Phone List Application
# Overview
The Phone List Application is a console-based program for managing a list of phone contacts. The application uses a linked list as the underlying data structure, providing dynamic and efficient management of contact information. The application supports operations such as adding, searching, deleting, and displaying contacts.

# Features
Add Contact: Add a new contact to the phone list.
Search Contact: Search for a contact by name or phone number.
Delete Contact: Remove a contact from the list by name or phone number.
Display Contacts: Display all the contacts in the phone list.
# Data Structure
The application uses a singly linked list to store the contacts. Each node in the linked list represents a contact and contains the following fields:

Name: The name of the contact (string).
Phone Number: The phone number of the contact (string or integer).
Next: A pointer to the next contact in the list.
# How It Works
# 1-Add Contact
Creates a new node with the given name and phone number.
Inserts the node at the end of the linked list.
# 2-Search Contact
Iterates through the linked list.
Compares the name or phone number of each node to the search query.
Returns the contact if found; otherwise, displays a "Contact not found" message.
# 3-Delete Contact
Searches for the contact by name or phone number.
Adjusts the pointers to remove the node from the list.
Frees the memory of the deleted node.
# 4-Display Contacts
Traverses the linked list from the head node.
Prints each contact's name and phone number.

# Menu Options
Upon running the application, you'll be presented with a menu:

1.Add Contact: Enter the name and phone number when prompted.
2.Search Contact: Input the name or phone number to search.
3.Delete Contact: Enter the name or phone number to delete a contact.
4.Display Contacts: View all saved contacts.
5.Exit: Exit the program.

# Benefits of Using Linked Lists
1.Dynamic Memory Allocation: Memory is allocated as needed, avoiding fixed-size limitations.
2.Efficient Insertions/Deletions: Adding or removing contacts is faster than in arrays, as there is no need for shifting elements.

