# *Observer Pattern*
```
You don't want to miss out when something interesting happens.
We've got a pattern that keeps your objects in the know when something they care about happens.
Right, it's the *Observer Pattern*.

eg:
    A newspaper published goes into business and begins publishing newspapers.
    You subscribe to a particular publisher, and every time there is new edtion
    it gets deliverd to you. As long as you remain a subscriber, you get new newspaper.
    You unsubscribe when you don't want papers anymore, and they stop being deliverd.
    While the publisher remains in business, people, hotels, airlines, and oter business
    constantly subscribe and unsubscribe to the newspaper.
    
*Observer Pattern* defines a one-to-many dependency between objects so that when one object
changes state, all of its depenpents are notfied and updated automatically.

In software world, the publisher calls `SUBJECT`, and the subscribers calls `OBSERVERS`.

We have one subject, who notifies many observers when something in the subject changes.
The observers are dependent on the subject--when the subject's state changes, 
the observers are notfied.

First, the only thing is the subject knows about an observer is that is implements a certain
interface--the Observer interface. It doesn't need to know the concrete class of the observer,
what it does, or anthing else about it.

We can add new observers at any time. The only thing the subject depends on is a list of objects
that implement the Observer interface, we can add new observers whenever we want.
In fact, we can replace any observer at runtime with another observer and the subject will keep
puring along. Likewise, we can remove observers at any time.

We never need to modify the subject to add new types of observers. We have a new concrete class 
come along that needs to be an observer. We don't need to make any changes to the subject to
accommodate the new class type; all we have to do is implement the Observer interface in the new
class and register as an observer. The subject doesn't care; it will deliver notifcations to any
object that implements the Observer interface.

We can reuse subjects or observers independently of each other. If we have another use for a subject
or an observer, we can easily reuse them because the two aren't tightly coupled.

Changes to either the subject or an observer will not affect the other. Because thw two are loosely
coupled, we are free to make changes to either, as long as the objects still meet their obligations
to implement the Subjbect or Observer interfaces.
```