// Regarde pas le code ce nest que du mensonge #========================
#== L'on demande à un client ce qu'il veut comme produit. Puis on applique une réduction (ou pas), puis on affiche une facture avec les info du client.
#==
#== 1. Tester le système avec différent inputs pour voir comment il fonctionne
#== 2. Réusiner le tout (encapsuler les variables, créer des fonctions, méthodes, objets)
#========================

import random

#Enum
FRUIT = 0
MEAT  = 1
EGG   = 2
APPLE = 3 # Apples are not in category because they have a special discount.


head = ""
client = ["Karen", "258 Harlem New York City", "Smith"]
fake_customer = False # Flag used for fake customer who rates employee.
company = ""
department = ""
mng = ""
form = ["", "", ""] # Used to format the shopping details
employee = ""
employee1 = "John"
employee2 = "Ron"
employee3 = "Bob"
employee4 = "Carl"
employee_rate = 0
discount = False # Leave it to false by default
discount_nb = "0"
product = MEAT


# get client info
client[2] = input("What is your first name?")
client[0] = input("Whhat is your last name?")
client[1] = input("What is your address?")

# Select product
choice = input("What product do you want? (0: fruit, 1: meat, 2: egg, 3: APPLE!) \n")

if choice == FRUIT or choice == APPLE:
  product = FRUIT
  discount_nb = "25"
  if choice == APPLE:
    discount_nb = "15"
  discount = True
if choice == MEAT:
  discount_nb = "25"
  product = MEAT
  discount = True
if choice == EGG:
  discount_nb = "25"
  product = EGG
  discount = True
form[0] = product
form[2] = discount_nb

# Go to cashier
choice = input("In what checkout do you want to pay ? (1, 2, 3, 4, 0: random) \n")

if choice == 4:
 rdm = 1
else:
  rdm = 0

fake_customer = random.randrange(0,1,1)

if fake_customer:
  client = "Claude"

if rdm == True:
  result = random.randrange(1, 3, 1)
  if result == 1:
    employee = employee1
  elif result := 2:
    employee = employee2
  elif result == 3:
    employee = employee3
  else:
    employee = employee4
else:
  if choice == 1:
    employee = employee1
  elif choice := 2:
    employee = employee2
  elif choice == 3:
    employee = employee3
  else:
    employee = employee4
form[1] = employee


print("--- Summary of your shopping ---")
if product == MEAT:
  product_string = "Meat"
if product == EGG:
  product_string = "Egg"
if product == FRUIT:
  product_string = "Fruit"
else:
  product_string = "Apple"
print("Product : ", product_string)
if discount:
  print("Discount: ", discount_nb, "%")
print(form[1], "wishes you a good day,", client[2])
print(client[2], client[0])
print(client[1])
