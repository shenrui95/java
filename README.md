# java、
0328 review
• If you don't want a class to be initialized, mark it as abstract with the abstract keyword.
• Abstract classes can have both abstract and non-abstract methods.
• If the class has an abstract method, this class must be identified as abstract.
• The abstract method has no content, and its declaration ends with a semicolon.
• Abstract methods must be run in a concrete class.
• All classes in java are direct or indirect subclasses of Object.
• A method can declare an argument or return type of an Object.
• Regardless of the type of object actually referenced, the method can only be called if the type of the reference variable is a type with a method.
• An Object reference variable cannot be assigned to another type without a type conversion. If the object type on the heap is not compatible with the type being converted, the conversion will generate an exception during the execution.
• Objects fetched from ArrayList<Object> can only be referenced by Object, otherwise they will be changed with type conversion.
• java does not allow multiple inheritance
• The interface is like a 100% natural abstract class
• Declare the interface by replacing the class with the keyword interface
• Use the implements keyword when implementing the interface.
• class can implement multiple interfaces
• A class that implements an interface must implement all its methods.
• Methods that want to call a parent class from a subclass can be referenced with the keyword super.
