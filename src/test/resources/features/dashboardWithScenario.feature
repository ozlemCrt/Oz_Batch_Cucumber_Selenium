@regression
Feature: Dashboard

  @titleChecks
  Scenario Outline: Title checks
    Given The user is on the login page
    When The user logs in using "john@gmail.com" and "John1234."
    And Go to "<tab>" and "<module>"
    Then Verify that "<title1>" and "<title2>" and "<title3>"
    Examples:
      | tab        | module       | title1 | title2     | title3    |
      | Components | Modal        | Home   | Components | Modal     |
      | Components | Alerts       | Home   | Components | Alerts    |
      | Components | Accordion    | Home   | Components | Accordion |
      | Components | Carousel     | Home   | Components | Carousel  |
      | Components | List Group   | Home   | Components | Listgroup |
      | Components | Tabs         | Home   | Components | Tabs      |
      | Components | Tooltips     | Home   | Components | Tooltips  |
      | Components | Charts       | Home   | Components | Charts    |
      | Components | Iframe       | Home   | Components | Iframe    |
      | Components | Open New Tab | Home   | Components | Opennew   |


  @formsTitle
  Scenario Outline: Forms Title
    Given The user is on the login page
    When The user logs in using "orhan@gmail.com" and "Orhan1234*"
    And Go to "<tab>" and "<module>"
    Then Verify that "<title1>" and "<title2>" and "<title3>"

    Examples:
      | tab   | module          | title1 | title2 | title3      |
      | Forms | Input           | Home   | Forms  | Input       |
      | Forms | Textarea        | Home   | Forms  | Textarea    |
      | Forms | Radio           | Home   | Forms  | Radio       |
      | Forms | Checkbox        | Home   | Forms  | Checkbox    |
      | Forms | Select          | Home   | Forms  | Select      |
      | Forms | File Upload     | Home   | Forms  | Fileupload  |
      | Forms | Date            | Home   | Forms  | Date        |
      | Forms | Time            | Home   | Forms  | Time        |
      | Forms | Color Picker    | Home   | Forms  | Colorpicker |
      | Forms | Switches        | Home   | Forms  | Switches    |
      | Forms | Ranges          | Home   | Forms  | Ranges      |
      | Forms | Submit          | Home   | Forms  | Submit      |
      | Forms | orm Elements    | Home   | Forms  | Elements    |
      | Forms | Form Validation | Home   | Forms  | Validation  |

@javascript
  Scenario Outline: JavaScript Title
    Given The user is on the login page
    When The user logs in using "orhan@gmail.com" and "Orhan1234*"
    And Go to "<tab>" and "<module>"
    Then Verify that "<title1>" and "<title2>" and "<title3>"
    Examples:
      | tab        | module       | title1 | title2     | title3       |
      | JavaScript | Clicks       | Home   | JavaScript | Clicks        |
      | JavaScript | Alerts       | Home   | JavaScript | Alerts       |
      | JavaScript | Sortable     | Home   | JavaScript | Sortable     |
      | JavaScript | Draggable    | Home   | JavaScript | Draggable    |
      | JavaScript | Selectable   | Home   | JavaScript | Selectable   |
      | JavaScript | Autocomplete | Home   | JavaScript | Autocomplete |
      | JavaScript | Progressbar  | Home   | JavaScript | Progressbar  |
      | JavaScript | Open New Tab | Home   | JavaScript | Opennew      |
