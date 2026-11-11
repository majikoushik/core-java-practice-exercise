# Scenario Catalog — All 65 Core Java Exercises

Familiar examples, one main learning target per exercise, and no implementation hints. Open the individual assignment for the complete scenario, requirements and task.

## Phase 1: Java Fundamentals

**P01T01: Java Runtime: Helpdesk Diagnostic Badge**  
A laptop-repair helpdesk receives screenshots of Java applications failing on customers’ computers. The support agent needs a short label showing exactly which Java runtime is executing the application, rather than relying on what a customer remembers installing.

**P01T02: Java Setup: Classroom Laptop Readiness**  
Before a Java workshop begins, the course coordinator checks whether each classroom laptop can compile Java and whether an IDE has been configured. A laptop is usable only when both checks succeed.

**P01T03: Program Structure: Student Club Membership IDs**  
A college has sports, arts, and coding clubs. Each club assigns membership IDs with the same standard format so that registrations can be recognized across different club applications.

**P01T04: Data Types: Cloud Photo Backup Storage**  
A phone-photo backup website displays storage allowances in mebibytes (MiB), but its billing service stores allowances as whole bytes. Some customers have plans much larger than the range of a 32-bit integer.

**P01T05: Operators: App Feature Switches**  
A simple mobile app can turn features such as notifications, dark mode, and location sharing on or off. For compact storage, the app represents the enabled features in one integer; each feature occupies its own individual bit.

**P01T06: Conditions and Switch: Museum Entry and Helpdesk**  
A museum has a simple entry rule for visitors and a separate information counter that routes questions to the right team. These two mini-tasks represent everyday decisions made from input values.

**P01T07: Loops: On-Time Delivery Streak**  
A food-delivery app shows how many consecutive days a delivery partner was on time starting from the beginning of a weekly report. A negative delay means early delivery, zero means exactly on time, and a positive value means late.

**P01T08: Arrays: Cinema Seats by Row**  
A small cinema displays a seat map as a rectangular two-dimensional array. The value `0` means a seat can still be booked, while `1` means it has already been reserved.

**P01T09: Methods: Shopping Bill and Reference Number**  
An online grocery app needs to add together any number of item prices (recorded as whole units). Separately, customer support needs a small utility that reports the digit total of a numeric complaint reference.

## Phase 2: Object-Oriented Programming

**P02T10: Classes and Objects: Sports Club Equipment Loans**  
A college sports club lends badminton rackets and footballs to students. Each physical item has a code and can be borrowed by only one student at a time. Two rackets must maintain their availability independently.

**P02T11: Constructors: Event Promotion Campaign**  
An event organizer creates small promotional campaigns. Sometimes they start a blank draft; at other times the organizer already knows the event name and available spending budget.

**P02T12: Encapsulation: Prepaid Canteen Wallet**  
Students can load money into a prepaid wallet and use it at a campus canteen. The wallet must protect its balance from invalid operations and from spending more money than the student has.

**P02T13: Inheritance: Standard and Express Parcel Delivery**  
A parcel-delivery shop offers regular delivery and express delivery. Both services charge based on parcel weight, but express delivery has an additional fixed surcharge.

**P02T14: Polymorphism: Online Shopping Discounts**  
A shopping website sometimes offers a fixed-amount coupon and sometimes a percentage discount. The checkout screen should apply either offer without changing the checkout calculation workflow.

**P02T15: Abstraction: Email and SMS Notifications**  
A movie-ticket booking website sends booking updates through email or text message. Its booking service should work with either channel without needing to know the details of that channel.

**P02T16: Keywords: Standard and VIP Event Passes**  
At a concert entrance, staff scan standard passes and VIP passes. The scanner must label a recognized pass correctly and report unknown items without crashing.

**P02T17: Object Class: Customer Loyalty Card Identity**  
A shop issues loyalty card IDs. The same card may be reconstructed from two separate files, producing two Java objects that must still be recognized as the same logical card.

**P02T18: Access Modifiers: Protecting Customer Information**  
A small banking app holds a customer name, account tier, branch identifier, and a secret PIN. Some of these details may be visible outside the class, while the PIN must not be directly exposed.

**P02T19: Nested Classes: Conference Attendance Badges**  
A college organizes a technology conference. Every participant has a conference pass, and each attended talk is attached to that particular participant. Separately, badges can be printed before a person is assigned to a pass.

**P02T20: Composition: Shopping Checkout with Messaging**  
A small online store delegates price calculation to a pricing service and sends the buyer an order message through a separate messaging service. The checkout code should continue working when either service is replaced.

## Phase 3: Essential Java APIs

**P03T21: Strings: Blog URLs and Activity History**  
A community blogging website creates simple readable URLs from article headlines. A separate admin page displays recent activity events on one line.

**P03T22: Wrapper Classes: Missing Numbers in a Survey**  
An online school survey exports optional numeric responses into a CSV-like table. Some cells are blank because students skipped the question. A blank response must not be confused with the number zero.

**P03T23: Exceptions: ATM Withdrawal Validation**  
An ATM displays an available balance and receives a requested withdrawal amount. If the request is impossible, it must reject the transaction rather than returning an incorrect balance.

**P03T24: Custom Exceptions: Reserving Event Seats**  
A college event has a limited number of seats. Students reserve groups of seats, and the booking interface needs a special error when the request is larger than the remaining capacity.

**P03T25: Packages: Routes for College Service Desks**  
A college has separate service desks for Arts, Sports, and Admissions. They all use the same organization prefix in their internal route labels, which is supplied by another Java package.

**P03T26: Date and Time: Online Order Delivery Planning**  
An online shop promises to dispatch orders after a specified number of working days, but its dispatch team does not work on weekends. A second screen shows order updates in the customer’s own time zone.

**P03T27: Regex: Scanning School Equipment Labels**  
A school library and sports room put standardized stickers on items to simplify stocktaking. The scanner accepts labels only when every character follows the approved pattern.

**P03T28: Enums: Tracking Online Shopping Orders**  
A shopping app tracks an order from creation through payment, packing, and shipping. Staff should not be able to skip mandatory stages or move an order backwards.

## Phase 4: Collections and Generics

**P04T29: Collections: Counting Customer Support Questions**  
A small store runs a customer helpdesk. Every incoming question is assigned a simple category such as `delivery`, `payment`, or `returns`. At the end of the day, staff need to see how frequently each category occurred.

**P04T30: Lists: Student Workshop Waiting List**  
A weekend coding workshop is full. Registrations are saved in order in a waiting list, and a student may accidentally register more than once. When the student cancels one registration, only the first matching place should be removed.

**P04T31: Sets: Detecting Repeated Entry Pass Scans**  
Staff scan QR codes at a school festival entrance. Some tickets are accidentally scanned twice or more. The report should list which ticket IDs were repeated, following the order in which they first became duplicates.

**P04T32: Queue and Deque: Customer Service Priority**  
A customer-support kiosk receives two separate lines: customers with urgent account-lock issues and customers with ordinary questions. The operator serves urgent customers first, but should respect arrival order within each line.

**P04T33: Maps: Updating a Grocery Store Stock List**  
A neighborhood grocery shop records available quantities by item code. In the morning, a delivery arrives with additional quantities. The shop wants an updated stock report without changing yesterday’s records.

**P04T34: Iterators: Removing Expired Discount Coupons**  
A shopping website keeps active discount coupons in a mutable map. Each coupon code is paired with the numbered day on which it expires. When staff open the dashboard, they want expired coupons removed.

**P04T35: Sorting: Employee Directory and Experience**  
A company displays employee records in two ways: a seniority view showing more experienced employees first, and a team directory grouped by team name. The records should be reusable between the two views.

**P04T36: Generics: Reusable Last-Item and Score Summaries**  
A dashboard can display lists of book titles, student names, or recent orders. It needs a reusable way to obtain the last displayed item. A separate chart totals scores that may be stored as integers or decimals.

**P04T37: HashMap Internals: Identifying Products Across Stores**  
The same product code can be stocked in several grocery branches. A product is uniquely identified by **both** its store code and the product code; the same product code in different stores represents separate inventory.

**P04T38: Choosing Collections: Website User Roles**  
A website administrator assigns permissions to roles such as `reader`, `editor`, and `admin`. The import file may repeat the same permission several times. The screen must show roles in arrival order and each permission only once.

## Phase 5: Modern Java and Functional Programming

**P05T39: Functional Interfaces: Scholarship Shortlisting**  
A college runs several student-support programs. One program accepts students scoring at least 70, while another uses a different rule. The shortlist service should accept the rule as an input rather than be rewritten for every program.

**P05T40: Lambda Expressions: Minimum Order Filter**  
A shopping app offers users a filter called “Orders above ₹500.” The value can change, so the app needs a reusable condition representing the selected minimum total.

**P05T41: Method References: Cleaning a Contact List**  
A user imports contacts from a messaging app. The imported list has names surrounded by spaces and occasional blank entries. Before displaying the contacts, the app needs a clean alphabetical view.

**P05T42: Streams: Exporting a Shopping Product Catalog**  
An online store shares an active-products list with another service. Some catalog entries are disabled, and a product code may appear more than once. The exported list must contain clean, unique codes.

**P05T43: Stream Terminal Operations: Store Payment Summary**  
A shop owner looks at a dashboard of payment records. Completed payments should contribute to revenue, while disputed payments should trigger a warning that some transaction needs attention.

**P05T44: Collectors: Workshop Participants by City and Age**  
A city-wide workshop collects applicants from different cities. Organizers need the number of applicants from each city and separate lists of adults and minors for registration handling.

**P05T45: Optional: Sending Verified Email Receipts**  
An online bookstore emails receipts only when a customer has verified an email address. Some accounts have no address or contain whitespace from an incomplete signup process.

**P05T46: Modern Java: Payment Success or Failure**  
A payment screen receives one of two possible responses: a successful receipt with an amount, or a failure explaining that the payment could not proceed. The UI needs a compact status label for either case.

## Phase 6: Multithreading and Concurrency

**P06T47: Threads: Running a Named Background Task**  
A desktop app performs a short background task, such as refreshing a list of notifications, while the main screen remains responsive. The support team also wants each worker thread to have an identifiable name.

**P06T48: Thread Operations: Waiting for a Report**  
A desktop report generator starts a worker and allows the user to wait for it, but only for a limited period. If the report is still running when the limit is reached, the app should remain responsive.

**P06T49: Synchronization: Counting Website Visitors**  
A school event website receives many page visits at almost the same time. Every visit should increase a shared counter by one; if two visitors arrive simultaneously, neither increment may be lost.

**P06T50: Wait/Notify: Opening a Concert Venue Gate**  
Several visitors are waiting outside a concert gate. The entrance controller opens the gate once, at which point everyone waiting can enter; late arrivals should be allowed through without waiting again.

**P06T51: Executors: Processing Quiz Scores**  
A learning website needs to process many quiz scores. It assigns simple score transformations to a fixed number of workers but must present the results in the same order as the student submissions.

**P06T52: Concurrent Collections: Student Council Vote Counting**  
During a student-council election, thousands of vote records arrive close together. Each vote contains a candidate ID. The final tally must account for every vote, even when votes are processed concurrently.

**P06T53: CompletableFuture: Loyalty Points on a Shopping App**  
A shopping app displays a short welcome message that combines a customer name from one service and reward points from another. The two services reply asynchronously and may finish in either order.

**P06T54: Virtual Threads: Checking Multiple Booking Confirmations**  
A travel website must contact several independent booking partners. Each partner check can spend time waiting, so the application wants to run them concurrently and still report results in the order requested.

## Phase 7: Advanced Core Java and Tooling

**P07T55: Java I/O: Adding Expenses from a Text File**  
A student saves daily expense amounts in a simple UTF-8 text export. Each nonblank line contains one whole-number expense. A budgeting app needs to calculate the total without requiring a spreadsheet program.

**P07T56: NIO.2: Finding CSV Files in a Downloads Folder**  
A school administrator exports attendance sheets into a download folder. The import tool must find only CSV files at the top level, ignoring text notes and other folders.

**P07T57: Serialization: Saving a Game Session**  
A simple offline quiz game wants to save its own session identifier and number of attempts before the player closes the program. On restart, the app restores those values from bytes it created itself.

**P07T58: JVM Internals: Identifying Who Loaded a Class**  
A Java application has a diagnostics page that lists whether classes came from the core Java runtime or the application’s own code. This can help engineers understand which runtime component is being inspected.

**P07T59: Memory Management: Clearing an Image Preview**  
A photo-viewing app temporarily keeps image bytes while the user previews a picture. Once the preview is closed, the application should no longer retain a reference to the large byte array.

**P07T60: Reflection: Reading App Configuration Fields**  
A desktop application has configuration fields such as server address, region, and display theme. An admin page should list only fields that developers explicitly marked as configurable.

**P07T61: Annotations: Tracking Admin Actions**  
An online shop records sensitive administrator operations such as charging a payment and issuing a refund. Developers label the relevant service methods so an audit tool can discover which actions require special logging.

**P07T62: JDBC: Transferring Money Between Two Accounts**  
A small banking app stores account IDs and balances in a relational table named `accounts`. When a person transfers money between accounts, either both balances must change or neither may change.

**P07T63: Java Modules: Sharing a Library API**  
A team develops a reusable library module for a school application. They want other modules to access the library’s public API package while keeping the module definition explicit.

**P07T64: JUnit: Testing Refund Amounts**  
A ticket-booking platform refunds customers after subtracting a service fee and a cancellation penalty. It must not pay a negative refund when the deductions are larger than the original payment.

**P07T65: Maven: Reading Project Coordinates**  
A developer tool scans a Maven project and shows its official identity as group ID, artifact ID, and version. A project POM can also contain dependencies and plugins with similar-looking identifiers, so the tool must identify the project itself.

