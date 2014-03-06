Simple FSM Environment
===

Introduction
---
Simple FSM Environment provides a complete environment to create and run very simple finite state machines. The action within a particular state is limited to printing a string and asking for textual input. The only possible event to trigger a transition is the input of a string that corresponds with that transition.

This project illustrates the creation of a meta-model, DSL and proper programming tools through the use of Eclipse Modeling Framework. In particular, Xcore is used to define the meta-model, Xtext to define the grammar and create the programming environment, Epsilon to transform the meta-model and to generate source code for a compiler. The purpose of this project is to get familiar with these tools, in order to apply the learned skills on a substantially larger project.

Installation and usage
---

###Installation instructions
1. Download sources: `git clone https://github.com/gijss/simplefsm.git`
2. Install dependencies
    1. Install Java (tested with openjdk-7-jdk)
    2. Install [Eclipse](https://www.eclipse.org/downloads/) (tested with Eclipse 4.3.2)
    3. Install [Xcore](https://wiki.eclipse.org/Xcore) (tested with Xcore 1.1.2)
    4. Install [Xtext](https://www.eclipse.org/Xtext/) (tested with Xtext 2.5.3)
    5. Install [Epsilon](https://www.eclipse.org/epsilon/) (tested with Epsilon 1.1.0)
    6. Download Rodinia sources: `git clone http://git.mech.kuleuven.be/robotics/rodinia.git` (tested with Master branch from Mon, 28 Oct 2013 18:33:45)

###Build programming environment
3. Start Eclipse and import into workspace:
    1. All projects from simplefsm repository
    2. Project `be.kuleuven.rodinia.epsilon.service` from Rodinia repository
4. Generate Xtext Artifacts:
    1. Select `Sfsm.xtext` from `be.kuleuven.learning.simplefsm.dsl` project and
    2. Right click and choose Run As -> Generate Xtext Artifacts from its context menu
5. Register metamodel into Epsilon:
    1. Select `simplefsm.ecore` from `be.kuleuven.learning.simplefsm.model` project and
    2. Right click and choose Register EPackages from its context menu

###Program and run an sfsm
6. Launch Runtime Eclipse:
    1. Choose Run As -> Run Configurations...
    2. Choose Eclipse Application -> Launch Runtime Eclipse
    3. Click Run to run with default configuration
7. Add project `be.kuleuven.learning.simplefsm.impl.java` from the simplefsm repository to the new workspace
8. Create new project
8. Add dependency to `be.kuleuven.learning.simplefsm.impl.java` in newly created project`
10. Create new file with an .sfsm extension
11. Define sfsm using the right grammar
12. Select sfsm file and choose Sfsm -> Create Structural Code from menu bar
13. Refresh workspace and open new .java file
14. Run java file!
 
More information
---

In the doc folder of the project, more information can be found.
