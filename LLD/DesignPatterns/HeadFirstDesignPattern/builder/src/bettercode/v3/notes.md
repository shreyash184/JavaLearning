Now to tackle previous problems, 
What if we create a new Builder class and add all the properties in that with setters and pass the builder object in product's constructor ?

What problems it is solving ?

- Large args 
- Don't need to remember order.
- I can do validation before object creation
- We can keep args optional
- No concept of spelling mistake comes in place !!

-------------------------------------------------------
- Not sure whether it will work for immutable objects.
-------------------------------------------------------

Any drawback ?

Main Class doesn't look good.
