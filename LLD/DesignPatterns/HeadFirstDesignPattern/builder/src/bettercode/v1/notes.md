Now previously we had 3 problems 

So now, what if we use setters to set the values and kept the empty constructor this should solve some of our problems

Let's try to code this out

So what problems it is solving now -

1. Large no. of args.
2. Now we don't need to remember order as well.
3. We can keep the args optional as well, It will taken as default value.

But, In this approach I can see few problems - 

1. We can't do validation before object creation
2. This will not work with immutable objects as there is no concept for setters.

So we can't use this approach directly, But this will definetly help us in our final solution building. That's why we have tried this.