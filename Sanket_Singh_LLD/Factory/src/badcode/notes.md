Now please observe what are the problem you might face in the current approach

**Problems** -

1. CoffeeProcessor is dependent on concreate implementation
2. If we want to add new type of coffee, We need to change code of CoffeeProcessor
3. Dependency Inversion and Open Close principle is violated.

If we use factory class which takes all the object creation with him and we just inject the dependant object, which is called as dependeny injection.