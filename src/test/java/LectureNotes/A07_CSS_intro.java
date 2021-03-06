package LectureNotes;

public class A07_CSS_intro {
    /*
    Eclipse: ide, we use it to write code
intellij: ide, we use it to write code
java: is a programming language, we write our test using java language
maven: build tool, we use it for managing dependencies, running tests and generate reports
selenium webdriver: tool for automating the browser
testng: unit testing tool, we use it to write, organize, run tests, to do assertions, and reporting
Jira: is a bug tracking, project management tools
postman: used for testing apis manually, alternative is SOAP UI
Slack: used for communication

Sublime: text editor, alternatives: Notepad++, Sublime, VSCode, Atom, Jedit
__

default jira issues: task, story, bug

with xray , you can crate more issues: test, pre conditions, executions

__
Create a new class in intellij: OrderOfThings

ORDER in TestNG
by defautl test methods in testng are executed in alphabetical order.

Order starts from the smallest number
we can order tests using the priority keyword:
@Test(priority = 1)
public void test1(){
System.out.println("Executing 1");
}


SKIP
@Ignore


@Ignore
@Test(priority = 2)
public void test3(){
System.out.println("Executing 3");
}

Create another new class in the test package: DependenciesTest

DEPENDENCIES on testNG
in testng we can make test methods dependant on one another,
for example we can say method1 depends on method2.
so if method1 fails, method2 will not execute at all, it will be skipped


if we give a low proprity to a dependency method, testnt will ignore the priority and still executes it first
___



Create another new class in the test package: MoreDependenciesTest


______

CSS
Css locator is just another type of locator used in Selenium
Using the html information such as htag, attribute, value of an element we can write css locator for it.
css locators are easy to read and write compared to xpath, they ar faster.

however css cannot do certain things xpath can do: it cannot find by text, it cannot find by certain types of index.

Maruf's list of locators
id, name, tag, class, css, xpath

1. css using elements tag, attr and value

<button class="btn btn-primary"> Search </button>


//button[@class='btn btn-primary'] : xpath

tag[attrbiute='value']

button[class='btn btn-primary'] : css

2. parent child

/html/body/div/div/div/form/button : xpath

html>body>div>div>div>form>button : css

> child

3. descendent
/html/body//form/button : xpath

html>body form>button : css

space in css means : descendant


3. id, any tag

<input type="text" name="email" id="email">
any element with id "email"

//*[@id='email'] : xpath

#email : css

# : id

_______

4. id, certain tag

<input type="text" name="email" id="email">
input element with id "email"

//input[@id='email'] : xpath

tag#id

input#email : css

5. class

<button class="btn btn-primary"> Search </button>

if there are space in class atrrbute, in means it is a different class

//button[@class='btn btn-primary'] : xpath

button.btn.btn-primary : css

. (dot) means class css

6. multiple attributes
<input type="text" class="inputtext _58mg _5dba _2ph-" data-type="text" name="firstname" aria-required="true" placeholder="" aria-label="First name" id="u_0_c">

input[type='text'][aria-label='First name']



7. contains

<input id="u_0_c">
any input element whose id contains 'u_0_'
//input[contains(@id, 'u_0_')] : xpath

input[id*='u_0_'] : css

8. starts with

any input element whose id starts with 'u_0_'
//input[starts-with(@id, 'u_0_')] : xpath

input[id^='u_0_'] : css



9. ends with

any input element whose id ends with 'u_0_c'
//input[ends-with(@id, 'u_0_')] : xpath

input[id$='u_0_c'] : css

________


<i class="hm-icon nav-sprite"></i>

i.hm-icon.nav-sprite


<a href="/gp/site-directory?ref_=nav_em_T1_0_2_2_33__fullstore" class="hmenu-item">
<div>
Full Store Directory
</div>
</a>


a[href='/gp/site-directory?ref_=nav_em_T1_0_2_2_33__fullstore']
___



<h2 class="fsdDeptTitle">Small &amp; Medium Businesses</h2>

h2.fsdDeptTitle


     */
}
