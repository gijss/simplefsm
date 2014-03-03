Simple Finite State Machine Grammar
===

This document is used to contemplate about the sfsm grammar.

First version
---


```
sfsm NAME {

    initial state STATENAME {
        action STRING
        event STRING goto STATENAME
    }

    state STATENAME {
	action STRING
	event STRING goto STATENAME
    }
}
```
