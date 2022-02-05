# MiniOS

Problem Statement: 

To write an application which replicates various functionalities of MacOS X, such as Process, Memory, I/O and File Management, as well as combine them into a single menu driven program. 


OS FUNCTIONALITIES
Process Management: 

* The method by which the processor completes the tasks assigned to it, as well as the chronology followed by it to execute the pending tasks. 

Memory Management:

* The method to dynamically allocate portions of memory to programs at their request, and free it for reuse when no longer needed. 

I/O Management: 

* The method of taking application requests to the physical device, and providing the application with the response received from the physical device. 

File Management:

* The method of providing users with an interface to manage their files, folders and various other collections of data.


Process Management: Multilevel Feedback Queue. Multilevel feedback queue scheduling allows a process to move between queues. This movement is facilitated by the characteristic of the CPU burst of the process. If a process uses too much CPU time, it will be moved to a lower-priority queue. This scheme leaves I/O-bound and interactive processes in the higher priority queues. In addition, a process that waits too long in a lower-priority queue may be moved to a higher priority queue. This form of aging also helps to prevent starvation of certain lower priority processes. 

Memory Management: Demand Paging It is a method of virtual memory management. In an OS that uses demand paging, the OS copies a disk page into physical memory only if an attempt is made to access it and that page is not already in memory. It follows that a process begins execution with none of its pages in physical memory, and many page faults will occur until most of a process's working set of pages are located in physical memory. It only loads pages that are demanded by the executing process. As there is more space in main memory, more processes can be loaded, reducing the context switching time, which utilises large amounts of resources and thus less loading latency occurs at program startup 

I/O Management: Bit Arrays. In this approach, the free space list is implemented as a bit map vector. It contains the number of bits where each bit represents each block. If the block is empty then the bit is 1 otherwise it is 0. Initially all the blocks are empty therefore each bit in the bit map vector contains 1. As the space allocation proceeds, the file system starts allocating blocks to the files and setting the respective bit to 0. They are extremely compact and allow small arrays of bits to be stored and manipulated in the register set for long periods of time with no memory accesses. 

File Management: Apple File System The file system can be used on devices with relatively small or large amounts of storage. It uses 64-bit inode numbers, and allows for more secure storage. The APFS code, uses the TRIM command, for better space management and performance as compared to HFS+. It increases read-write speeds on iOS and macOS, as well as space on iOS devices, due to the way APFS calculates available data
