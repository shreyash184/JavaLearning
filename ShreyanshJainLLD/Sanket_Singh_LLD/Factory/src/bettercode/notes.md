Now It resolve all 3 problems in bad code

1. CoffeeProcessor is dependent on concreate implementation
2. If we want to add new type of coffee, We need to change code of CoffeeProcessor
3. Dependency Inversion and Open Close principle is violated.

But now let's say I want Expresso with whiteMilk and brown sugar.

How the Factory pattern is failing here and which could be the solution for this ?

**Problems** - 



**Solutions** - Abstract Factory Pattern

Q. When do we usually use abstract factory pattern?
