Now I let's use Hashmap to pass through the argument in constructor.

This solves -

1. Large no. of args.
2. Order issue.
3. We can keep optional args
4. We can validate args before object creation.
5. If object is immutable, still it will work, as there is not setter.

But I can see some issue still are there, which were not prevously.

1. What if hashmap do not have a property as a key.
2. In the hashmap, what if there is a spelling mistake in properties.