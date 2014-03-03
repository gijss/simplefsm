Simple FSM Environment
===

Introduction
---
Simple FSM Environment provides a complete environment to create and run very simple finite state machines. The action within a particular state is limited to printing a string and asking for textual input. The only possible event to trigger a transition is the input of a string that corresponds with that transition.

This project illustrates the creation of a meta-model, DSL and proper programming tools through the use of Eclipse Modeling Framework. In particular, Xcore is used to define the meta-model, Xtext to define the grammar and create the programming environment, Epsilon to transform the meta-model and to generate source code for a compiler. The purpose of this project is to get familiar with these tools, in order to apply the learned skills on a substantially larger project.

Installation instructions
---

1. Download sources: `git clone https://github.com/gijss/simplefsm.git`
2. Install dependencies
    1. Install [Eclipse](https://www.eclipse.org/downloads/)
    2. Install [Xcore](https://wiki.eclipse.org/Xcore)
    3. Install [Xtext](https://www.eclipse.org/Xtext/)
    4. Install [Epsilon](https://www.eclipse.org/epsilon/)
3. Start Eclipse and import sources into workspace
4.  ...

More information
---

In the doc folder of the project, more information can be found.
