package japgolly.scalajs.react.vdom

import Scalatags._

trait HtmlAttrs {

  /**
   * This is the single required attribute for anchors defining a hypertext
   * source link. It indicates the link target, either a URL or a URL fragment.
   * A URL fragment is a name preceded by a hash mark (#), which specifies an
   * internal target location (an ID) within the current document. URLs are not
   * restricted to Web (HTTP)-based documents. URLs might use any protocol
   * supported by the browser. For example, file, ftp, and mailto work in most
   * user agents.
   *
   * MDN
   */
  final val href = "href".attr
  /**
   * The URI of a program that processes the information submitted via the form.
   * This value can be overridden by a formaction attribute on a button or
   * input element.
   *
   * MDN
   */
  final val action = "action".attr
  /**
   * The HTTP method that the browser uses to submit the form. Possible values are:
   *
   * - post: Corresponds to the HTTP POST method ; form data are included in the
   *   body of the form and sent to the server.
   *
   * - get: Corresponds to the HTTP GET method; form data are appended to the
   *   action attribute URI with a '?' as a separator, and the resulting URI is
   *   sent to the server. Use this method when the form has no side-effects and
   *   contains only ASCII characters.
   *
   * This value can be overridden by a formmethod attribute on a button or
   * input element.
   *
   * MDN
   */
  final val method = "method".attr
  /**
   * This attribute defines a unique identifier (ID) which must be unique in
   * the whole document. Its purpose is to identify the element when linking
   * (using a fragment identifier), scripting, or styling (with CSS).
   *
   * MDN
   */
  final val id = "id".attr
  /**
   * A name or keyword indicating where to display the response that is received
   * after submitting the form. In HTML 4, this is the name of, or a keyword
   * for, a frame. In HTML5, it is a name of, or keyword for, a browsing context
   * (for example, tab, window, or inline frame). The following keywords have
   * special meanings:
   *
   * - _self: Load the response into the same HTML 4 frame (or HTML5 browsing
   *   context) as the current one. This value is the default if the attribute
   *   is not specified.
   * - _blank: Load the response into a new unnamed HTML 4 window or HTML5
   *   browsing context.
   * - _parent: Load the response into the HTML 4 frameset parent of the current
   *   frame or HTML5 parent browsing context of the current one. If there is no
   *   parent, this option behaves the same way as _self.
   * - _top: HTML 4: Load the response into the full, original window, canceling
   *   all other frames. HTML5: Load the response into the top-level browsing
   *   context (that is, the browsing context that is an ancestor of the current
   *   one, and has no parent). If there is no parent, this option behaves the
   *   same way as _self.
   * - iframename: The response is displayed in a named iframe.
   */
  final val target = "target".attr
  /**
   * On form elements (input etc.):
   *   Name of the element. For example used by the server to identify the fields
   *   in form submits.
   *
   * On the meta tag:
   *   This attribute defines the name of a document-level metadata.
   *   This document-level metadata name is associated with a value, contained by
   *   the content attribute.
   *
   * MDN
   */
  final val name = "name".attr
  /**
   * This attribute defines the alternative text describing the image. Users
   * will see this displayed if the image URL is wrong, the image is not in one
   * of the supported formats, or until the image is downloaded.
   *
   * MDN
   */
  final val alt = "alt".attr
  /**
   * The blur event is raised when an element loses focus.
   *
   * MDN
   */
  final val onBlur = "onBlur".attr
  /**
   * The change event is fired for input, select, and textarea elements
   * when a change to the element's value is committed by the user.
   *
   * MDN
   */
  final val onChange = "onChange".attr
  /**
   * The click event is raised when the user clicks on an element. The click
   * event will occur after the mousedown and mouseup events.
   *
   * MDN
   */
  final val onClick = "onClick".attr
  /**
   * The dblclick event is fired when a pointing device button (usually a
   * mouse button) is clicked twice on a single element.
   *
   * MDN
   */
  final val onDblClick = "onDoubleClick".attr

  /** React alias for [[onDblClick]] */
  final def onDoubleClick = onDblClick
  /**
   * Type: script code
   *
   * This event is sent to an image element when an error occurs loading the image.
   *
   * https://developer.mozilla.org/en-US/docs/Mozilla/Tech/XUL/image#a-onerror
   */
  final val onError = "onError".attr
  /**
   * The focus event is raised when the user sets focus on the given element.
   *
   * MDN
   */
  final val onFocus = "onFocus".attr
  /**
   * The keydown event is raised when the user presses a keyboard key.
   *
   * MDN
   */
  final val onKeyDown = "onKeyDown".attr
  /**
   * The keyup event is raised when the user releases a key that's been pressed.
   *
   * MDN
   */
  final val onKeyUp = "onKeyUp".attr
  /**
   * The keypress event should be raised when the user presses a key on the keyboard.
   * However, not all browsers fire keypress events for certain keys.
   *
   * Webkit-based browsers (Google Chrome and Safari, for example) do not fire keypress events on the arrow keys.
   * Firefox does not fire keypress events on modifier keys like SHIFT.
   *
   * MDN
   */
  final val onKeyPress = "onKeyPress".attr
  /**
   * The load event fires at the end of the document loading process. At this
   * point, all of the objects in the document are in the DOM, and all the
   * images and sub-frames have finished loading.
   *
   * MDN
   */
  final val onLoad = "onLoad".attr
  /**
   * The mousedown event is raised when the user presses the mouse button.
   *
   * MDN
   */
  final val onMouseDown = "onMouseDown".attr
  /**
   * The mousemove event is raised when the user moves the mouse.
   *
   * MDN
   */
  final val onMouseMove = "onMouseMove".attr
  /**
   * The mouseout event is raised when the mouse leaves an element (e.g, when
   * the mouse moves off of an image in the web page, the mouseout event is
   * raised for that image element).
   *
   * MDN
   */
  final val onMouseOut = "onMouseOut".attr
  /**
   * The mouseover event is raised when the user moves the mouse over a
   * particular element.
   *
   * MDN
   */
  final val onMouseOver = "onMouseOver".attr
  /**
   * The mouseup event is raised when the user releases the mouse button.
   *
   * MDN
   */
  final val onMouseUp = "onMouseUp".attr
  /**
   * Event indicating that the touch point has been canceled or disrupted.
   *
   * For example, when popup menu is shown.
   *
   * @see [[japgolly.scalajs.react.ReactTouchEvent]]
   */
  final val onTouchCancel = "onTouchCancel".attr
  /**
   * Event indicating that the touch point does not exist any more.
   *
   * For example, whn you release your finger.
   *
   * @see [[japgolly.scalajs.react.ReactTouchEvent]]
   */
  final val onTouchEnd = "onTouchEnd".attr
  /**
   * Event indicating that the touch point has moved along the plane.
   *
   * @see [[japgolly.scalajs.react.ReactTouchEvent]]
   */
  final val onTouchMove = "onTouchMove".attr
  /**
   * Event indicating that the user has touched the plane.
   *
   * @see [[japgolly.scalajs.react.ReactTouchEvent]]
   */
  final val onTouchStart = "onTouchStart".attr
  /**
   * The select event only fires when text inside a text input or textarea is
   * selected. The event is fired after the text has been selected.
   *
   * MDN
   */
  final val onSelect = "onSelect".attr
  /**
   * Specifies the function to be called when the window is scrolled.
   *
   * MDN
   */
  final val onScroll = "onScroll".attr
  /**
   * The submit event is raised when the user clicks a submit button in a form
   * (<input type="submit"/>).
   *
   * MDN
   */
  final val onSubmit = "onSubmit".attr
  /**
   * The reset event is fired when a form is reset.
   *
   * MDN
   */
  final val onReset = "onReset".attr
  /**
   * This attribute names a relationship of the linked document to the current
   * document. The attribute must be a space-separated list of the link types
   * values. The most common use of this attribute is to specify a link to an
   * external style sheet: the rel attribute is set to stylesheet, and the href
   * attribute is set to the URL of an external style sheet to format the page.
   *
   *
   * MDN
   */
  final val rel = "rel".attr
  /**
   * If the value of the type attribute is image, this attribute specifies a URI
   * for the location of an image to display on the graphical submit button;
   * otherwise it is ignored.
   *
   * MDN
   */
  final val src = "src".attr
  /**
   * This attribute contains CSS styling declarations to be applied to the
   * element. Note that it is recommended for styles to be defined in a separate
   * file or files. This attribute and the style element have mainly the
   * purpose of allowing for quick styling, for example for testing purposes.
   *
   * MDN
   */
  final val style = "style".attr
  /**
   * This attribute contains a text representing advisory information related to
   * the element it belongs too. Such information can typically, but not
   * necessarily, be presented to the user as a tooltip.
   *
   * MDN
   */
  final val title = "title".attr
  /**
   * This attribute is used to define the type of the content linked to. The
   * value of the attribute should be a MIME type such as text/html, text/css,
   * and so on. The common use of this attribute is to define the type of style
   * sheet linked and the most common current value is text/css, which indicates
   * a Cascading Style Sheet format. You can use tpe as an alias for this
   * attribute so you don't have to backtick-escape this attribute.
   *
   * MDN
   */
  final val `type` = "type".attr
  /**
   * Shorthand for the `type` attribute
   */
  final val tpe = `type`
  /**
   *
   */
  final val xmlns = "xmlns".attr
//  /**
//   * This attribute is a space-separated list of the classes of the element.
//   * Classes allows CSS and Javascript to select and access specific elements
//   * via the class selectors or functions like the DOM method
//   * document.getElementsByClassName. You can use cls as an alias for this
//   * attribute so you don't have to backtick-escape this attribute.
//   *
//   * MDN
//   */
//  final val `class` = "className".attr
//  /**
//   * Shorthand for the `class` attribute
//   */
//  final val cls = `class`
  /**
   * This attribute participates in defining the language of the element, the
   * language that non-editable elements are written in or the language that
   * editable elements should be written in. The tag contains one single entry
   * value in the format defines in the Tags for Identifying Languages (BCP47)
   * IETF document. If the tag content is the empty string the language is set
   * to unknown; if the tag content is not valid, regarding to BCP47, it is set
   * to invalid.
   *
   * MDN
   */
  final val lang = "lang".attr
  /**
   * A hint to the user of what can be entered in the control. The placeholder
   * text must not contain carriage returns or line-feeds. This attribute
   * applies when the value of the type attribute is text, search, tel, url or
   * email; otherwise it is ignored.
   *
   * MDN
   */
  final val placeholder = "placeholder".attr
  /**
   * This enumerated attribute defines whether the element may be checked for
   * spelling errors.
   *
   * MDN
   */
  final val spellCheck = "spellCheck".attr
  /**
   * The initial value of the control. This attribute is optional except when
   * the value of the type attribute is radio or checkbox.
   *
   * MDN
   */
  final val value = "value".attr
  /**
   * If the value of the type attribute is file, this attribute indicates the
   * types of files that the server accepts; otherwise it is ignored.
   *
   * MDN
   */
  final val accept = "accept".attr
  /**
   * This attribute indicates whether the value of the control can be
   * automatically completed by the browser. This attribute is ignored if the
   * value of the type attribute is hidden, checkbox, radio, file, or a button
   * type (button, submit, reset, image).
   *
   * Possible values are "off" and "on"
   *
   * MDN
   */
  final val autoComplete = "autoComplete".attr
  /**
   * This Boolean attribute lets you specify that a form control should have
   * input focus when the page loads, unless the user overrides it, for example
   * by typing in a different control. Only one form element in a document can
   * have the autoFocus attribute, which is a Boolean. It cannot be applied if
   * the type attribute is set to hidden (that is, you cannot automatically set
   * focus to a hidden control).
   *
   * MDN
   */
  final val autoFocus = "autoFocus".attr
  /**
   * When the value of the type attribute is radio or checkbox, the presence of
   * this Boolean attribute indicates that the control is selected by default;
   * otherwise it is ignored.
   *
   * MDN
   */
  final val checked = "checked".attr
  /**
   * Declares the character encoding of the page or script. Used on meta and
   * script elements.
   *
   * MDN
   */
  final val charset = "charset".attr
  /**
   * This Boolean attribute indicates that the form control is not available for
   * interaction. In particular, the click event will not be dispatched on
   * disabled controls. Also, a disabled control's value isn't submitted with
   * the form.
   *
   * This attribute is ignored if the value of the type attribute is hidden.
   *
   * MDN
   */
  final val disabled = "disabled".attr
  /**
   * Describes elements which belongs to this one. Used on labels and output
   * elements.
   *
   * MDN
   */
  final val `for` = "htmlFor".attr
  /**
   * This Boolean attribute indicates that the user cannot modify the value of
   * the control. This attribute is ignored if the value of the type attribute
   * is hidden, range, color, checkbox, radio, file, or a button type.
   *
   * MDN
   */
  final val readOnly = "readOnly".attr
  /**
   * This attribute specifies that the user must fill in a value before
   * submitting a form. It cannot be used when the type attribute is hidden,
   * image, or a button type (submit, reset, or button). The :optional and
   * :required CSS pseudo-classes will be applied to the field as appropriate.
   *
   * MDN
   */
  final val required = "required".attr
  /**
   * The number of visible text lines for the control.
   *
   * MDN
   */
  final val rows = "rows".attr
  /**
   * The visible width of the text control, in average character widths. If it
   * is specified, it must be a positive integer. If it is not specified, the
   * default value is 20 (HTML5).
   *
   * MDN
   */
  final val cols = "cols".attr
  /**
   * The initial size of the control. This value is in pixels unless the value
   * of the type attribute is text or password, in which case, it is an integer
   * number of characters. Starting in HTML5, this attribute applies only when
   * the type attribute is set to text, search, tel, url, email, or password;
   * otherwise it is ignored. In addition, the size must be greater than zero.
   * If you don't specify a size, a default value of 20 is used.
   *
   * MDN
   */
  final val size = "size".attr
  /**
   * This integer attribute indicates if the element can take input focus (is
   * focusable), if it should participate to sequential keyboard navigation, and
   * if so, at what position. It can takes several values:
   *
   * - a negative value means that the element should be focusable, but should
   *   not be reachable via sequential keyboard navigation;
   * - 0 means that the element should be focusable and reachable via sequential
   *   keyboard navigation, but its relative order is defined by the platform
   *   convention;
   * - a positive value which means should be focusable and reachable via
   *   sequential keyboard navigation; its relative order is defined by the value
   *   of the attribute: the sequential follow the increasing number of the
   *   tabIndex. If several elements share the same tabIndex, their relative order
   *   follows their relative position in the document).
   *
   * An element with a 0 value, an invalid value, or no tabIndex value should be placed after elements with a positive tabIndex in the sequential keyboard navigation order.
   */
  final val tabIndex = "tabIndex".attr
  /**
   * The attribute describes the role(s) the current element plays in the
   * context of the document. This can be used, for example,
   * by applications and assistive technologies to determine the purpose of
   * an element. This could allow a user to make informed decisions on which
   * actions may be taken on an element and activate the selected action in a
   * device independent way. It could also be used as a mechanism for
   * annotating portions of a document in a domain specific way (e.g.,
   * a legal term taxonomy). Although the role attribute may be used to add
   * semantics to an element, authors should use elements with inherent
   * semantics, such as p, rather than layering semantics on semantically
   * neutral elements, such as div role="paragraph".
   *
   * @see http://www.w3.org/TR/role-attribute/#s_role_module_attributes
   */
  final val role = "role".attr
  /**
   * This attribute gives the value associated with the http-equiv or name
   * attribute, depending of the context.
   *
   * MDN
   */
  final val contentAttr = "content".attr
  /**
   * This enumerated attribute defines the pragma that can alter servers and
   * user-agents behavior. The value of the pragma is defined using the content
   * attribute and can be one of the following:
   *
   *   - content-language
   *   - content-type
   *   - default-style
   *   - refresh
   *   - set-cookie
   *
   * MDN
   */
  final val httpEquiv = "httpEquiv".attr
  /**
   * This attribute specifies the media which the linked resource applies to.
   * Its value must be a media query. This attribute is mainly useful when
   * linking to external stylesheets by allowing the user agent to pick
   * the best adapted one for the device it runs on.
   *
   * @see https://developer.mozilla.org/en-US/docs/Web/HTML/Element/link#attr-media
   */
  final val media = "media".attr

  /**
   * ARIA is a set of special accessibility attributes which can be added
   * to any markup, but is especially suited to HTML. The role attribute
   * defines what the general type of object is (such as an article, alert,
   * or slider). Additional ARIA attributes provide other useful properties,
   * such as a description for a form or the current value of a progressbar.
   *
   * MDN
   */
  object aria {
    /**
     * Identifies the currently active descendant of a composite widget.
     */
    final val activedescendant = "aria-activedescendant".attr
    /**
     * Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. See related aria-relevant.
     */
    final val atomic = "aria-atomic".attr
    /**
     * Indicates whether user input completion suggestions are provided.
     */
    final val autocomplete = "aria-autocomplete".attr
    /**
     * Indicates whether an element, and its subtree, are currently being updated.
     */
    final val busy = "aria-busy".attr
    /**
     * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets. See related aria-pressed and aria-selected.
     */
    final val checked = "aria-checked".attr
    /**
     * Identifies the element (or elements) whose contents or presence are controlled by the current element. See related aria-owns.
     */
    final val controls = "aria-controls".attr
    /**
     * Identifies the element (or elements) that describes the object. See related aria-labelledby.
     */
    final val describedby = "aria-describedby".attr
    /**
     * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable. See related aria-hidden and aria-readonly.
     */
    final val disabled = "aria-disabled".attr
    /**
     * Indicates what functions can be performed when the dragged object is released on the drop target. This allows assistive technologies to convey the possible drag options available to users, including whether a pop-up menu of choices is provided by the application. Typically, drop effect functions can only be provided once an object has been grabbed for a drag operation as the drop effect functions available are dependent on the object being dragged.
     */
    final val dropeffect = "aria-dropeffect".attr
    /**
     * Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed.
     */
    final val expanded = "aria-expanded".attr
    /**
     * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion, allows assistive technology to override the general default of reading in document source order.
     */
    final val flowto = "aria-flowto".attr
    /**
     * Indicates an element's "grabbed" state in a drag-and-drop operation.
     */
    final val grabbed = "aria-grabbed".attr
    /**
     * Indicates that the element has a popup context menu or sub-level menu.
     */
    final val haspopup = "aria-haspopup".attr
    /**
     * Indicates that the element and all of its descendants are not visible or perceivable to any user as implemented by the author. See related aria-disabled.
     */
    final val hidden = "aria-hidden".attr
    /**
     * Indicates the entered value does not conform to the format expected by the application.
     */
    final val invalid = "aria-invalid".attr
    /**
     * Defines a string value that labels the current element. See related aria-labelledby.
     */
    final val label = "aria-label".attr
    /**
     * Identifies the element (or elements) that labels the current element. See related aria-label and aria-describedby.
     */
    final val labelledby = "aria-labelledby".attr
    /**
     * Defines the hierarchical level of an element within a structure.
     */
    final val level = "aria-level".attr
    /**
     * Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region.
     */
    final val live = "aria-live".attr
    /**
     * Indicates whether a text box accepts multiple lines of input or only a single line.
     */
    final val multiline = "aria-multiline".attr
    /**
     * Indicates that the user may select more than one item from the current selectable descendants.
     */
    final val multiselectable = "aria-multiselectable".attr
    /**
     * Indicates whether the element and orientation is horizontal or vertical.
     */
    final val orientation = "aria-orientation".attr
    /**
     * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship between DOM elements where the DOM hierarchy cannot be used to represent the relationship. See related aria-controls.
     */
    final val owns = "aria-owns".attr
    /**
     * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM. See related aria-setsize.
     */
    final val posinset = "aria-posinset".attr
    /**
     * Indicates the current "pressed" state of toggle buttons. See related aria-checked and aria-selected.
     */
    final val pressed = "aria-pressed".attr
    /**
     * Indicates that the element is not editable, but is otherwise operable. See related aria-disabled.
     */
    final val readonly = "aria-readonly".attr
    /**
     * Indicates what user agent change notifications (additions, removals, etc.) assistive technologies will receive within a live region. See related aria-atomic.
     */
    final val relevant = "aria-relevant".attr
    /**
     * Indicates that user input is required on the element before a form may be submitted.
     */
    final val required = "aria-required".attr
    /**
     * Indicates the current "selected" state of various widgets. See related aria-checked and aria-pressed.
     */
    final val selected = "aria-selected".attr
    /**
     * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM. See related aria-posinset.
     */
    final val setsize = "aria-setsize".attr
    /**
     * Indicates if items in a table or grid are sorted in ascending or descending order.
     */
    final val sort = "aria-sort".attr
    /**
     * Defines the maximum allowed value for a range widget.
     */
    final val valuemax = "aria-valuemax".attr
    /**
     * Defines the minimum allowed value for a range widget.
     */
    final val valuemin = "aria-valuemin".attr
    /**
     * Defines the current value for a range widget. See related aria-valuetext.
     */
    final val valuenow = "aria-valuenow".attr
    /**
     * Defines the human readable text alternative of aria-valuenow for a range widget.
     */
    final val valuetext = "aria-valuetext".attr
  }
}