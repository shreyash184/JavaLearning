So What are the problems you can see in this approach ?

I can list few of them, which i encountered while implementing the code

1. Constructor parameters is very long, So can be difficult to manage.
2. I have to remember the order in which we need to pass the arguments.
3. What if we want to keep some args as optional, but in this approach we can see it is forcing us to pass the arguments.

So in-short I can see there are 3 problems.

1. Large no. of args.
2. Need to remember order of args.
3. We can't keep args optional.

Now let's see what are the benefits of this approach 

1. Validation is easy and can be done before the object creation.

Now, The problem of forcefully passing args can be solved by constructor overloading.
But It introduces 3 new problems

1. Constructor explosion [ex - For 4 attributes we need to create 16 constructors]
2. Code is not extensible, If new args comes, we need to make huge number of new constructor.
3. Few of the constructor will not be able to create, As constructor overloading check type of args.

So We actually can't use this approach solve problem no. 3.

