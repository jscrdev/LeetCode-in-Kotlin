# LeetCode-in-Kotlin

[![Maven Central](https://img.shields.io/maven-central/v/com.github.javadev/leetcode-in-kotlin?style=flat-square)](https://central.sonatype.com/artifact/com.github.javadev/leetcode-in-kotlin/1.39)
[![MIT License](http://img.shields.io/badge/license-MIT-green.svg) ](https://github.com/javadev/leetcode-in-kotlin/blob/main/LICENSE)
[![Java CI with Maven](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml/badge.svg)](https://github.com/javadev/LeetCode-in-Kotlin/actions/workflows/maven.yml)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=javadev_LeetCode-in-Kotlin&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=javadev_LeetCode-in-Kotlin)
[![javadoc](https://javadoc.io/badge2/com.github.javadev/leetcode-in-kotlin/javadoc.svg)](https://javadoc.io/doc/com.github.javadev/leetcode-in-kotlin)
[![](https://img.shields.io/github/stars/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin)
[![](https://img.shields.io/github/forks/javadev/LeetCode-in-Kotlin?style=flat-square)](https://github.com/javadev/LeetCode-in-Kotlin/fork)

Kotlin-based LeetCode algorithm problem solutions, regularly updated.

## Installation

To configure your Maven project, add the following code to your pom.xml file:

```xml
<dependencies>
  <dependency>
    <groupId>com.github.javadev</groupId>
    <artifactId>leetcode-in-kotlin</artifactId>
    <version>1.39</version>
  </dependency>
  ...
</dependencies>
```

Gradle configuration:

```groovy
implementation 'com.github.javadev:leetcode-in-kotlin:1.39'
```

> ["For coding interview preparation, LeetCode is one of the best online resource providing a rich library of more than 300 real coding interview questions for you to practice from using one of the 7 supported languages - C, C++, Java, Python, C#, JavaScript, Ruby."](https://www.quora.com/How-effective-is-Leetcode-for-preparing-for-technical-interviews)

##
* [Programming Skills II](#programming-skills-ii)
* [Graph Theory I](#graph-theory-i)
* [SQL I](#sql-i)
* [Level 1](#level-1)
* [Level 2](#level-2)
* [Udemy](#udemy)
* [Top Interview 150](#top-interview-150)
* [Data Structure I](#data-structure-i)
* [Data Structure II](#data-structure-ii)
* [Algorithm I](#algorithm-i)
* [Algorithm II](#algorithm-ii)
* [Binary Search I](#binary-search-i)
* [Binary Search II](#binary-search-ii)
* [Dynamic Programming I](#dynamic-programming-i)
* [Programming Skills I](#programming-skills-i)

### Programming Skills II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0896 |[Monotonic Array](src/main/kotlin/g0801_0900/s0896_monotonic_array/Solution.kt)| Easy | Array | 576 | 90.91
| 0028 |[Find the Index of the First Occurrence in a String](src/main/kotlin/g0001_0100/s0028_find_the_index_of_the_first_occurrence_in_a_string/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 126 | 97.58

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0110 |[Balanced Binary Tree](src/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 182 | 71.30
| 0459 |[Repeated Substring Pattern](src/main/kotlin/g0401_0500/s0459_repeated_substring_pattern/Solution.kt)| Easy | String, String_Matching | 201 | 100.00

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0150 |[Evaluate Reverse Polish Notation](src/main/kotlin/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Stack | 233 | 88.82
| 0066 |[Plus One](src/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 148 | 98.75

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1367 |[Linked List in Binary Tree](src/main/kotlin/g1301_1400/s1367_linked_list_in_binary_tree/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 237 | 92.86
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 165 | 96.72

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src/main/kotlin/g0001_0100/s0067_add_binary/Solution.kt)| Easy | String, Math, Bit_Manipulation, Simulation | 164 | 90.60
| 0989 |[Add to Array-Form of Integer](src/main/kotlin/g0901_1000/s0989_add_to_array_form_of_integer/Solution.kt)| Easy | Array, Math | 350 | 70.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0739 |[Daily Temperatures](src/main/kotlin/g0701_0800/s0739_daily_temperatures/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Stack, Monotonic_Stack, LeetCode_75_Monotonic_Stack, Big_O_Time_O(n)_Space_O(n) | 936 | 80.54
| 0058 |[Length of Last Word](src/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 135 | 93.67

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 160 | 90.11
| 1886 |[Determine Whether Matrix Can Be Obtained By Rotation](src/main/kotlin/g1801_1900/s1886_determine_whether_matrix_can_be_obtained_by_rotation/Solution.kt)| Easy | Array, Matrix | 147 | 85.71

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Simulation | 132 | 95.12
| 0973 |[K Closest Points to Origin](src/main/kotlin/g0901_1000/s0973_k_closest_points_to_origin/Solution.kt)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 800 | 37.89

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1630 |[Arithmetic Subarrays](src/main/kotlin/g1601_1700/s1630_arithmetic_subarrays/Solution.kt)| Medium | Array, Sorting | 264 | 100.00
| 0429 |[N-ary Tree Level Order Traversal](src/main/kotlin/g0401_0500/s0429_n_ary_tree_level_order_traversal/Solution.kt)| Medium | Breadth_First_Search, Tree | 248 | 75.86

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0503 |[Next Greater Element II](src/main/kotlin/g0501_0600/s0503_next_greater_element_ii/Solution.kt)| Medium | Array, Stack, Monotonic_Stack | 331 | 92.68
| 0556 |[Next Greater Element III](src/main/kotlin/g0501_0600/s0556_next_greater_element_iii/Solution.kt)| Medium | String, Math, Two_Pointers | 137 | 80.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src/main/kotlin/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 915 | 37.62
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 308 | 96.34

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 561 | 54.68
| 0713 |[Subarray Product Less Than K](src/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71
| 0910 |[Smallest Range II](src/main/kotlin/g0901_1000/s0910_smallest_range_ii/Solution.kt)| Medium | Array, Math, Sorting, Greedy | 234 | 100.00

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0143 |[Reorder List](src/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 395 | 82.26
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Big_O_Time_O(N)_Space_O(N) | 123 | 90.70

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Big_O_Time_O(max(N,M))_Space_O(max(N,M)), AI_can_be_used_to_solve_the_task | 2 | 87.63
| 0445 |[Add Two Numbers II](src/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List | 240 | 82.61

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0061 |[Rotate List](src/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 160 | 92.22
| 0173 |[Binary Search Tree Iterator](src/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1845 |[Seat Reservation Manager](src/main/kotlin/g1801_1900/s1845_seat_reservation_manager/SeatManager.kt)| Medium | Design, Heap_Priority_Queue | 834 | 100.00
| 0860 |[Lemonade Change](src/main/kotlin/g0801_0900/s0860_lemonade_change/Solution.kt)| Easy | Array, Greedy | 413 | 86.96

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 331 | 84.88
| 0341 |[Flatten Nested List Iterator](src/main/kotlin/g0301_0400/s0341_flatten_nested_list_iterator/NestedIterator.kt)| Medium | Depth_First_Search, Tree, Stack, Design, Queue, Iterator | 210 | 100.00

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1797 |[Design Authentication Manager](src/main/kotlin/g1701_1800/s1797_design_authentication_manager/AuthenticationManager.kt)| Medium | Hash_Table, Design | 334 | 100.00
| 0707 |[Design Linked List](src/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0380 |[Insert Delete GetRandom O(1)](src/main/kotlin/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.kt)| Medium | Array, Hash_Table, Math, Design, Randomized | 1326 | 68.23
| 0622 |[Design Circular Queue](src/main/kotlin/g0601_0700/s0622_design_circular_queue/MyCircularQueue.kt)| Medium | Array, Design, Linked_List, Queue | 234 | 92.68
| 0729 |[My Calendar I](src/main/kotlin/g0701_0800/s0729_my_calendar_i/MyCalendar.kt)| Medium | Binary_Search, Design, Ordered_Set, Segment_Tree | 378 | 69.70

### Graph Theory I

#### Day 1 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 252 | 95.41

#### Day 2 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0695 |[Max Area of Island](src/main/kotlin/g0601_0700/s0695_max_area_of_island/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 181 | 93.83
| 1254 |[Number of Closed Islands](src/main/kotlin/g1201_1300/s1254_number_of_closed_islands/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 177 | 89.47

#### Day 3 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1020 |[Number of Enclaves](src/main/kotlin/g1001_1100/s1020_number_of_enclaves/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 283 | 90.70
| 1905 |[Count Sub Islands](src/main/kotlin/g1901_2000/s1905_count_sub_islands/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 866 | 100.00

#### Day 4 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1162 |[As Far from Land as Possible](src/main/kotlin/g1101_1200/s1162_as_far_from_land_as_possible/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 362 | 81.25
| 0417 |[Pacific Atlantic Water Flow](src/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 5 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src/main/kotlin/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 305 | 98.28
| 0542 |[01 Matrix](src/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06

#### Day 6 Matrix Related Problems

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0934 |[Shortest Bridge](src/main/kotlin/g0901_1000/s0934_shortest_bridge/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 301 | 80.95
| 1926 |[Nearest Exit from Entrance in Maze](src/main/kotlin/g1901_2000/s1926_nearest_exit_from_entrance_in_maze/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix, LeetCode_75_Graphs/BFS | 351 | 94.44

#### Day 7 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0797 |[All Paths From Source to Target](src/main/kotlin/g0701_0800/s0797_all_paths_from_source_to_target/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 232 | 100.00
| 0841 |[Keys and Rooms](src/main/kotlin/g0801_0900/s0841_keys_and_rooms/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, LeetCode_75_Graphs/DFS | 189 | 69.23

#### Day 8 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, LeetCode_75_Graphs/DFS | 229 | 79.73
| 1319 |[Number of Operations to Make Network Connected](src/main/kotlin/g1301_1400/s1319_number_of_operations_to_make_network_connected/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 379 | 83.33

#### Day 9 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1376 |[Time Needed to Inform All Employees](src/main/kotlin/g1301_1400/s1376_time_needed_to_inform_all_employees/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree | 915 | 37.62
| 0802 |[Find Eventual Safe States](src/main/kotlin/g0801_0900/s0802_find_eventual_safe_states/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 511 | 100.00

#### Day 10 Standard Traversal

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1129 |[Shortest Path with Alternating Colors](src/main/kotlin/g1101_1200/s1129_shortest_path_with_alternating_colors/Solution.kt)| Medium | Breadth_First_Search, Graph | 208 | 80.00
| 1466 |[Reorder Routes to Make All Paths Lead to the City Zero](src/main/kotlin/g1401_1500/s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, LeetCode_75_Graphs/DFS | 718 | 100.00
| 0847 |[Shortest Path Visiting All Nodes](src/main/kotlin/g0801_0900/s0847_shortest_path_visiting_all_nodes/Solution.kt)| Hard | Dynamic_Programming, Breadth_First_Search, Bit_Manipulation, Graph, Bitmask | 164 | 100.00

#### Day 11 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1306 |[Jump Game III](src/main/kotlin/g1301_1400/s1306_jump_game_iii/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search | 291 | 100.00
| 1654 |[Minimum Jumps to Reach Home](src/main/kotlin/g1601_1700/s1654_minimum_jumps_to_reach_home/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search | 192 | 100.00
| 0365 |[Water and Jug Problem](src/main/kotlin/g0301_0400/s0365_water_and_jug_problem/Solution.kt)| Medium | Math, Depth_First_Search, Breadth_First_Search | 130 | 100.00

#### Day 12 Breadth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0433 |[Minimum Genetic Mutation](src/main/kotlin/g0401_0500/s0433_minimum_genetic_mutation/Solution.kt)| Medium | String, Hash_Table, Breadth_First_Search | 204 | 82.08
| 0752 |[Open the Lock](src/main/kotlin/g0701_0800/s0752_open_the_lock/Solution.kt)| Medium | Array, String, Hash_Table, Breadth_First_Search | 310 | 100.00
| 0127 |[Word Ladder](src/main/kotlin/g0101_0200/s0127_word_ladder/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 396 | 98.68

#### Day 13 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src/main/kotlin/g0901_1000/s0997_find_the_town_judge/Solution.kt)| Easy | Array, Hash_Table, Graph | 475 | 58.62
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src/main/kotlin/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.kt)| Medium | Graph | 792 | 99.29

#### Day 14 Graph Theory

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1615 |[Maximal Network Rank](src/main/kotlin/g1601_1700/s1615_maximal_network_rank/Solution.kt)| Medium | Graph | 282 | 100.00
| 0886 |[Possible Bipartition](src/main/kotlin/g0801_0900/s0886_possible_bipartition/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 397 | 100.00
| 0785 |[Is Graph Bipartite?](src/main/kotlin/g0701_0800/s0785_is_graph_bipartite/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find | 215 | 82.35

### SQL I

#### Day 1 Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0595 |[Big Countries](src/main/kotlin/g0501_0600/s0595_big_countries/script.sql)| Easy | Database | 417 | 56.09
| 1757 |[Recyclable and Low Fat Products](src/main/kotlin/g1701_1800/s1757_recyclable_and_low_fat_products/script.sql)| Easy | Database | 1237 | 34.20
| 0584 |[Find Customer Referee](src/main/kotlin/g0501_0600/s0584_find_customer_referee/script.sql)| Easy | Database | 779 | 43.48
| 0183 |[Customers Who Never Order](src/main/kotlin/g0101_0200/s0183_customers_who_never_order/script.sql)| Easy | Database | 712 | 33.67

#### Day 2 Select and Order

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1873 |[Calculate Special Bonus](src/main/kotlin/g1801_1900/s1873_calculate_special_bonus/script.sql)| Easy | Database | 1321 | 33.12
| 0627 |[Swap Salary](src/main/kotlin/g0601_0700/s0627_swap_salary/script.sql)| Easy | Database | 400 | 51.04
| 0196 |[Delete Duplicate Emails](src/main/kotlin/g0101_0200/s0196_delete_duplicate_emails/script.sql)| Easy | Database | 593 | 94.17

#### Day 3 String Processing Functions

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1667 |[Fix Names in a Table](src/main/kotlin/g1601_1700/s1667_fix_names_in_a_table/script.sql)| Easy | Database | 1196 | 61.40
| 1484 |[Group Sold Products By The Date](src/main/kotlin/g1401_1500/s1484_group_sold_products_by_the_date/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 899 | 40.76
| 1527 |[Patients With a Condition](src/main/kotlin/g1501_1600/s1527_patients_with_a_condition/script.sql)| Easy | Database | 708 | 48.23

#### Day 4 Union and Select

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1965 |[Employees With Missing Information](src/main/kotlin/g1901_2000/s1965_employees_with_missing_information/script.sql)| Easy | Database | 949 | 88.66
| 1795 |[Rearrange Products Table](src/main/kotlin/g1701_1800/s1795_rearrange_products_table/script.sql)| Easy | Database | 1027 | 67.57
| 0608 |[Tree Node](src/main/kotlin/g0601_0700/s0608_tree_node/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 794 | 48.38
| 0176 |[Second Highest Salary](src/main/kotlin/g0101_0200/s0176_second_highest_salary/script.sql)| Medium | Database | 219 | 92.54

#### Day 5 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0175 |[Combine Two Tables](src/main/kotlin/g0101_0200/s0175_combine_two_tables/script.sql)| Easy | Database | 473 | 54.97
| 1581 |[Customer Who Visited but Did Not Make Any Transactions](src/main/kotlin/g1501_1600/s1581_customer_who_visited_but_did_not_make_any_transactions/script.sql)| Easy | Database | 2771 | 54.68
| 1148 |[Article Views I](src/main/kotlin/g1101_1200/s1148_article_views_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 806 | 54.41

#### Day 6 Union

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0197 |[Rising Temperature](src/main/kotlin/g0101_0200/s0197_rising_temperature/script.sql)| Easy | Database | 394 | 94.15
| 0607 |[Sales Person](src/main/kotlin/g0601_0700/s0607_sales_person/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 2142 | 44.56

#### Day 7 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1141 |[User Activity for the Past 30 Days I](src/main/kotlin/g1101_1200/s1141_user_activity_for_the_past_30_days_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 790 | 87.11
| 1693 |[Daily Leads and Partners](src/main/kotlin/g1601_1700/s1693_daily_leads_and_partners/script.sql)| Easy | Database | 1115 | 52.84
| 1729 |[Find Followers Count](src/main/kotlin/g1701_1800/s1729_find_followers_count/script.sql)| Easy | Database | 1228 | 38.04

#### Day 8 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0586 |[Customer Placing the Largest Number of Orders](src/main/kotlin/g0501_0600/s0586_customer_placing_the_largest_number_of_orders/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 768 | 44.85
| 0511 |[Game Play Analysis I](src/main/kotlin/g0501_0600/s0511_game_play_analysis_i/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 790 | 45.04
| 1890 |[The Latest Login in 2020](src/main/kotlin/g1801_1900/s1890_the_latest_login_in_2020/script.sql)| Easy | Database | 1280 | 43.62
| 1741 |[Find Total Time Spent by Each Employee](src/main/kotlin/g1701_1800/s1741_find_total_time_spent_by_each_employee/script.sql)| Easy | Database | 1101 | 51.40

#### Day 9 Control of Flow

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1393 |[Capital Gain/Loss](src/main/kotlin/g1301_1400/s1393_capital_gainloss/script.sql)| Medium | LeetCode_Curated_SQL_70, Database | 990 | 47.36
| 1407 |[Top Travellers](src/main/kotlin/g1401_1500/s1407_top_travellers/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 1394 | 98.43
| 1158 |[Market Analysis I](src/main/kotlin/g1101_1200/s1158_market_analysis_i/script.sql)| Medium | Database | 2470 | 44.76

#### Day 10 Where

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0182 |[Duplicate Emails](src/main/kotlin/g0101_0200/s0182_duplicate_emails/script.sql)| Easy | Database | 396 | 68.40
| 1050 |[Actors and Directors Who Cooperated At Least Three Times](src/main/kotlin/g1001_1100/s1050_actors_and_directors_who_cooperated_at_least_three_times/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 629 | 81.02
| 1587 |[Bank Account Summary II](src/main/kotlin/g1501_1600/s1587_bank_account_summary_ii/script.sql)| Easy | Database | 1582 | 52.96
| 1084 |[Sales Analysis III](src/main/kotlin/g1001_1100/s1084_sales_analysis_iii/script.sql)| Easy | LeetCode_Curated_SQL_70, Database | 1881 | 79.36

### Level 1

#### Day 1 Prefix Sum

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1480 |[Running Sum of 1d Array](src/main/kotlin/g1401_1500/s1480_running_sum_of_1d_array/Solution.kt)| Easy | Array, Prefix_Sum | 161 | 84.80
| 0724 |[Find Pivot Index](src/main/kotlin/g0701_0800/s0724_find_pivot_index/Solution.kt)| Easy | Array, Prefix_Sum, LeetCode_75_Prefix_Sum | 255 | 88.92

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0205 |[Isomorphic Strings](src/main/kotlin/g0201_0300/s0205_isomorphic_strings/Solution.kt)| Easy | String, Hash_Table | 278 | 79.96
| 0392 |[Is Subsequence](src/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers, LeetCode_75_Two_Pointers | 156 | 87.74

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 157 | 92.24
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, LeetCode_75_LinkedList, Big_O_Time_O(N)_Space_O(1) | 279 | 45.78

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 192 | 63.39

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 609 | 94.06
| 0409 |[Longest Palindrome](src/main/kotlin/g0401_0500/s0409_longest_palindrome/Solution.kt)| Easy | String, Hash_Table, Greedy | 259 | 60.71

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 233 | 84.02
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 198 | 95.14

#### Day 7 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0278 |[First Bad Version](src/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86

#### Day 8 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 190 | 61.62
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 404 | 75.59

#### Day 9 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 252 | 95.41

#### Day 10 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 124 | 71.98

#### Day 11 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0746 |[Min Cost Climbing Stairs](src/main/kotlin/g0701_0800/s0746_min_cost_climbing_stairs/Solution.kt)| Easy | Array, Dynamic_Programming, LeetCode_75_DP/1D | 171 | 96.76
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, LeetCode_75_DP/Multidimensional, Big_O_Time_O(m\*n)_Space_O(m\*n) | 118 | 94.65

#### Day 12 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 561 | 54.68
| 0424 |[Longest Repeating Character Replacement](src/main/kotlin/g0401_0500/s0424_longest_repeating_character_replacement/Solution.kt)| Medium | String, Hash_Table, Sliding_Window | 288 | 84.38

#### Day 13 Hashmap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n), AI_can_be_used_to_solve_the_task | 2 | 98.77
| 0299 |[Bulls and Cows](src/main/kotlin/g0201_0300/s0299_bulls_and_cows/Solution.kt)| Medium | String, Hash_Table, Counting | 254 | 84.82

#### Day 14 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src/main/kotlin/g0801_0900/s0844_backspace_string_compare/Solution.kt)| Easy | String, Two_Pointers, Stack, Simulation | 126 | 98.31
| 0394 |[Decode String](src/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, LeetCode_75_Stack, Big_O_Time_O(n)_Space_O(n) | 224 | 64.86

#### Day 15 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1046 |[Last Stone Weight](src/main/kotlin/g1001_1100/s1046_last_stone_weight/Solution.kt)| Easy | Array, Heap_Priority_Queue | 123 | 100.00
| 0692 |[Top K Frequent Words](src/main/kotlin/g0601_0700/s0692_top_k_frequent_words/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Trie, Bucket_Sort | 239 | 81.10

### Level 2

#### Day 1 Implementation/Simulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Simulation | 132 | 95.12
| 1706 |[Where Will the Ball Fall](src/main/kotlin/g1701_1800/s1706_where_will_the_ball_fall/Solution.kt)| Medium | Array, Dynamic_Programming, Depth_First_Search, Matrix, Simulation | 270 | 67.86

#### Day 2 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String, Big_O_Time_O(n\*m)_Space_O(m) | 154 | 89.70
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 165 | 96.72

#### Day 3 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Big_O_Time_O(L)_Space_O(L) | 144 | 96.28
| 0234 |[Palindrome Linked List](src/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Two_Pointers, Stack, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 641 | 79.53

#### Day 4 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0328 |[Odd Even Linked List](src/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Linked_List, LeetCode_75_LinkedList | 216 | 86.96
| 0148 |[Sort List](src/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort, Big_O_Time_O(log(N))_Space_O(log(N)) | 820 | 61.70

#### Day 5 Greedy

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 2131 |[Longest Palindrome by Concatenating Two Letter Words](src/main/kotlin/g2101_2200/s2131_longest_palindrome_by_concatenating_two_letter_words/Solution.kt)| Medium | Array, String, Hash_Table, Greedy, Counting | 607 | 90.00
| 0621 |[Task Scheduler](src/main/kotlin/g0601_0700/s0621_task_scheduler/Solution.kt)| Medium | Array, Hash_Table, Sorting, Greedy, Heap_Priority_Queue, Counting | 266 | 98.36

#### Day 6 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 233 | 54.90
| 0110 |[Balanced Binary Tree](src/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 182 | 71.30

#### Day 7 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0543 |[Diameter of Binary Tree](src/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 307 | 43.93
| 0437 |[Path Sum III](src/main/kotlin/g0401_0500/s0437_path_sum_iii/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(n)_Space_O(n) | 403 | 54.12

#### Day 8 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 151 | 93.77

#### Day 9 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 167 | 80.29
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(n) | 393 | 33.33
| 0173 |[Binary Search Tree Iterator](src/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 10 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Breadth_First_Search, Matrix, LeetCode_75_Graphs/BFS | 164 | 82.95
| 0417 |[Pacific Atlantic Water Flow](src/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Day 11 Graph/BFS/DFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0210 |[Course Schedule II](src/main/kotlin/g0201_0300/s0210_course_schedule_ii/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 266 | 96.32
| 0815 |[Bus Routes](src/main/kotlin/g0801_0900/s0815_bus_routes/Solution.kt)| Hard | Array, Hash_Table, Breadth_First_Search | 429 | 100.00

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, LeetCode_75_DP/1D, Big_O_Time_O(n)_Space_O(n) | 156 | 92.24
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 332 | 50.68

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0416 |[Partition Equal Subset Sum](src/main/kotlin/g0401_0500/s0416_partition_equal_subset_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Big_O_Time_O(n\*sums)_Space_O(n\*sums) | 204 | 98.82
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 253 | 88.42

#### Day 14 Sliding Window/Two Pointer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1), AI_can_be_used_to_solve_the_task | 3 | 99.17
| 0016 |[3Sum Closest](src/main/kotlin/g0001_0100/s0016_3sum_closest/Solution.kt)| Medium | Array, Sorting, Two_Pointers | 163 | 100.00
| 0076 |[Minimum Window Substring](src/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(s.length())_Space_O(1) | 191 | 96.38

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0100 |[Same Tree](src/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 134 | 86.63
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 153 | 82.35
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/BFS | 194 | 92.89

#### Day 16 Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0232 |[Implement Queue using Stacks](src/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 331 | 84.88
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, LeetCode_75_Trie, Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N) | 689 | 61.00

#### Day 17 Interval

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0057 |[Insert Interval](src/main/kotlin/g0001_0100/s0057_insert_interval/Solution.kt)| Medium | Array | 249 | 75.63
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 334 | 80.67

#### Day 18 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0735 |[Asteroid Collision](src/main/kotlin/g0701_0800/s0735_asteroid_collision/Solution.kt)| Medium | Array, Stack, LeetCode_75_Stack | 243 | 100.00
| 0227 |[Basic Calculator II](src/main/kotlin/g0201_0300/s0227_basic_calculator_ii/Solution.kt)| Medium | String, Math, Stack | 383 | 62.50

#### Day 19 Union Find

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0547 |[Number of Provinces](src/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, LeetCode_75_Graphs/DFS | 229 | 79.73
| 0947 |[Most Stones Removed with Same Row or Column](src/main/kotlin/g0901_1000/s0947_most_stones_removed_with_same_row_or_column/Solution.kt)| Medium | Depth_First_Search, Graph, Union_Find | 200 | 100.00

#### Day 20 Brute Force/Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 226 | 88.89
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 188 | 99.00

### Udemy

#### Udemy Integers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0412 |[Fizz Buzz](src/main/kotlin/g0401_0500/s0412_fizz_buzz/Solution.kt)| Easy | String, Math, Simulation | 307 | 71.81
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, LeetCode_75_Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 344 | 83.63
| 0007 |[Reverse Integer](src/main/kotlin/g0001_0100/s0007_reverse_integer/Solution.kt)| Medium | Top_Interview_Questions, Math, Big_O_Time_O(log10(x))_Space_O(1) | 149 | 77.89
| 0009 |[Palindrome Number](src/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math, Big_O_Time_O(log10(x))_Space_O(1) | 217 | 95.34
| 0172 |[Factorial Trailing Zeroes](src/main/kotlin/g0101_0200/s0172_factorial_trailing_zeroes/Solution.kt)| Medium | Top_Interview_Questions, Math | 220 | 67.65
| 0050 |[Pow(x, n)](src/main/kotlin/g0001_0100/s0050_powx_n/Solution.kt)| Medium | Top_Interview_Questions, Math, Recursion | 172 | 38.68

#### Udemy Strings

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src/main/kotlin/g0301_0400/s0344_reverse_string/Solution.kt)| Easy | String, Two_Pointers, Recursion | 445 | 69.75
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String, Big_O_Time_O(n\*m)_Space_O(m) | 154 | 89.70
| 0187 |[Repeated DNA Sequences](src/main/kotlin/g0101_0200/s0187_repeated_dna_sequences/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 319 | 79.03
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1), AI_can_be_used_to_solve_the_task | 3 | 99.17
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Big_O_Time_O(n)_Space_O(n) | 137 | 88.76
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 8 | 96.61
| 0394 |[Decode String](src/main/kotlin/g0301_0400/s0394_decode_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Stack, Recursion, LeetCode_75_Stack, Big_O_Time_O(n)_Space_O(n) | 224 | 64.86
| 0242 |[Valid Anagram](src/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | String, Hash_Table, Sorting | 251 | 87.65
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 308 | 96.34
| 0151 |[Reverse Words in a String](src/main/kotlin/g0101_0200/s0151_reverse_words_in_a_string/Solution.kt)| Medium | String, Two_Pointers, LeetCode_75_Array/String | 206 | 98.90
| 0273 |[Integer to English Words](src/main/kotlin/g0201_0300/s0273_integer_to_english_words/Solution.kt)| Hard | String, Math, Recursion | 273 | 82.93

#### Udemy Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 151 | 93.77
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 262 | 60.96

#### Udemy Arrays

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 609 | 94.06
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Two_Pointers, LeetCode_75_Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 516 | 79.07
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n), AI_can_be_used_to_solve_the_task | 2 | 98.77
| 0217 |[Contains Duplicate](src/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49
| 0058 |[Length of Last Word](src/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 135 | 93.67
| 0605 |[Can Place Flowers](src/main/kotlin/g0601_0700/s0605_can_place_flowers/Solution.kt)| Easy | Array, Greedy, LeetCode_75_Array/String | 209 | 85.71
| 0122 |[Best Time to Buy and Sell Stock II](src/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10
| 0080 |[Remove Duplicates from Sorted Array II](src/main/kotlin/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.kt)| Medium | Array, Two_Pointers | 192 | 80.67
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 483 | 86.95
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 332 | 89.35
| 0075 |[Sort Colors](src/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 164 | 64.43
| 0066 |[Plus One](src/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 148 | 98.75
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Prefix_Sum, LeetCode_75_Array/String, Big_O_Time_O(n^2)_Space_O(n) | 669 | 48.96
| 1291 |[Sequential Digits](src/main/kotlin/g1201_1300/s1291_sequential_digits/Solution.kt)| Medium | Enumeration | 114 | 100.00
| 0448 |[Find All Numbers Disappeared in an Array](src/main/kotlin/g0401_0500/s0448_find_all_numbers_disappeared_in_an_array/Solution.kt)| Easy | Array, Hash_Table | 394 | 100.00
| 0442 |[Find All Duplicates in an Array](src/main/kotlin/g0401_0500/s0442_find_all_duplicates_in_an_array/Solution.kt)| Medium | Array, Hash_Table | 480 | 73.81
| 0041 |[First Missing Positive](src/main/kotlin/g0001_0100/s0041_first_missing_positive/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n) | 357 | 97.17
| 0697 |[Degree of an Array](src/main/kotlin/g0601_0700/s0697_degree_of_an_array/Solution.kt)| Easy | Array, Hash_Table | 289 | 84.62
| 0532 |[K-diff Pairs in an Array](src/main/kotlin/g0501_0600/s0532_k_diff_pairs_in_an_array/Solution.kt)| Medium | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 230 | 84.62
| 0713 |[Subarray Product Less Than K](src/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11
| 1007 |[Minimum Domino Rotations For Equal Row](src/main/kotlin/g1001_1100/s1007_minimum_domino_rotations_for_equal_row/Solution.kt)| Medium | Array, Greedy | 421 | 50.00
| 1306 |[Jump Game III](src/main/kotlin/g1301_1400/s1306_jump_game_iii/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search | 291 | 100.00
| 0456 |[132 Pattern](src/main/kotlin/g0401_0500/s0456_132_pattern/Solution.kt)| Medium | Array, Binary_Search, Stack, Ordered_Set, Monotonic_Stack | 434 | 100.00
| 0239 |[Sliding Window Maximum](src/main/kotlin/g0201_0300/s0239_sliding_window_maximum/Solution.kt)| Hard | Top_100_Liked_Questions, Array, Heap_Priority_Queue, Sliding_Window, Queue, Monotonic_Queue, Big_O_Time_O(n\*k)_Space_O(n+k) | 1059 | 86.14

#### Udemy Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers, LeetCode_75_Two_Pointers | 156 | 87.74
| 0125 |[Valid Palindrome](src/main/kotlin/g0101_0200/s0125_valid_palindrome/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers | 353 | 52.06
| 0977 |[Squares of a Sorted Array](src/main/kotlin/g0901_1000/s0977_squares_of_a_sorted_array/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 271 | 77.17
| 0026 |[Remove Duplicates from Sorted Array](src/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers | 249 | 67.38
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(1) | 189 | 99.37
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 493 | 93.45

#### Udemy Famous Algorithm

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 510 | 78.81
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 460 | 51.25

#### Udemy Sorting Algorithms

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0912 |[Sort an Array](src/main/kotlin/g0901_1000/s0912_sort_an_array/Solution.kt)| Medium | Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Merge_Sort, Bucket_Sort, Counting_Sort, Radix_Sort | 606 | 98.48

#### Udemy 2D Arrays/Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0304 |[Range Sum Query 2D - Immutable](src/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Simulation | 132 | 95.12
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 160 | 90.11
| 1572 |[Matrix Diagonal Sum](src/main/kotlin/g1501_1600/s1572_matrix_diagonal_sum/Solution.kt)| Easy | Array, Matrix | 221 | 67.61
| 0073 |[Set Matrix Zeroes](src/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix, Big_O_Time_O(m\*n)_Space_O(1) | 248 | 97.33
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 334 | 80.67

#### Udemy Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0114 |[Flatten Binary Tree to Linked List](src/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List, Big_O_Time_O(N)_Space_O(N) | 191 | 93.10
| 0445 |[Add Two Numbers II](src/main/kotlin/g0401_0500/s0445_add_two_numbers_ii/Solution.kt)| Medium | Math, Stack, Linked_List | 240 | 82.61
| 0328 |[Odd Even Linked List](src/main/kotlin/g0301_0400/s0328_odd_even_linked_list/Solution.kt)| Medium | Linked_List, LeetCode_75_LinkedList | 216 | 86.96
| 0061 |[Rotate List](src/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 160 | 92.22
| 0024 |[Swap Nodes in Pairs](src/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 149 | 44.20
| 0876 |[Middle of the Linked List](src/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 192 | 63.39
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 223 | 91.85
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, LeetCode_75_LinkedList, Big_O_Time_O(N)_Space_O(1) | 279 | 45.78
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 157 | 92.24
| 0160 |[Intersection of Two Linked Lists](src/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(M+N)_Space_O(1) | 262 | 83.50
| 0234 |[Palindrome Linked List](src/main/kotlin/g0201_0300/s0234_palindrome_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Two_Pointers, Stack, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 641 | 79.53
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Big_O_Time_O(N)_Space_O(N) | 123 | 90.70
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(k) | 189 | 67.03
| 0146 |[LRU Cache](src/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List, Big_O_Time_O(1)_Space_O(capacity) | 1116 | 97.93
| 0707 |[Design Linked List](src/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Udemy Tree Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 277 | 37.90
| 0094 |[Binary Tree Inorder Traversal](src/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Big_O_Time_O(n)_Space_O(n) | 152 | 66.67
| 0145 |[Binary Tree Postorder Traversal](src/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 211 | 80.00
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 198 | 95.14
| 0103 |[Binary Tree Zigzag Level Order Traversal](src/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 176 | 71.62
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 167 | 80.29
| 1008 |[Construct Binary Search Tree from Preorder Traversal](src/main/kotlin/g1001_1100/s1008_construct_binary_search_tree_from_preorder_traversal/Solution.kt)| Medium | Array, Tree, Binary_Tree, Stack, Monotonic_Stack, Binary_Search_Tree | 145 | 100.00
| 0543 |[Diameter of Binary Tree](src/main/kotlin/g0501_0600/s0543_diameter_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 307 | 43.93
| 0938 |[Range Sum of BST](src/main/kotlin/g0901_1000/s0938_range_sum_of_bst/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 356 | 55.36
| 0100 |[Same Tree](src/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 134 | 86.63
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 233 | 54.90
| 0111 |[Minimum Depth of Binary Tree](src/main/kotlin/g0101_0200/s0111_minimum_depth_of_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 525 | 90.51
| 0104 |[Maximum Depth of Binary Tree](src/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(N)_Space_O(H) | 166 | 83.53
| 0110 |[Balanced Binary Tree](src/main/kotlin/g0101_0200/s0110_balanced_binary_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree | 182 | 71.30
| 0701 |[Insert into a Binary Search Tree](src/main/kotlin/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 311 | 79.03
| 0297 |[Serialize and Deserialize Binary Tree](src/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 475 | 78.85
| 0124 |[Binary Tree Maximum Path Sum](src/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 331 | 74.42
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 190 | 61.62
| 0337 |[House Robber III](src/main/kotlin/g0301_0400/s0337_house_robber_iii/Solution.kt)| Medium | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 282 | 84.62
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(n)_Space_O(n) | 386 | 45.21
| 0968 |[Binary Tree Cameras](src/main/kotlin/g0901_1000/s0968_binary_tree_cameras/Solution.kt)| Hard | Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree | 176 | 100.00

#### Udemy Trie and Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, LeetCode_75_Trie, Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N) | 689 | 61.00
| 0745 |[Prefix and Suffix Search](src/main/kotlin/g0701_0800/s0745_prefix_and_suffix_search/WordFilter.kt)| Hard | String, Design, Trie | 1638 | 100.00

#### Udemy Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 252 | 95.41
| 0133 |[Clone Graph](src/main/kotlin/g0101_0200/s0133_clone_graph/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph | 351 | 60.91
| 0417 |[Pacific Atlantic Water Flow](src/main/kotlin/g0401_0500/s0417_pacific_atlantic_water_flow/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix | 319 | 100.00

#### Udemy Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0120 |[Triangle](src/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87
| 0118 |[Pascal's Triangle](src/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22
| 0119 |[Pascal's Triangle II](src/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 197 | 87.17
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 253 | 88.42
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, LeetCode_75_DP/1D, Big_O_Time_O(n)_Space_O(n) | 156 | 92.24
| 0213 |[House Robber II](src/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0509 |[Fibonacci Number](src/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 124 | 71.98
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 164 | 100.00
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 318 | 82.28
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n\*m)_Space_O(n\*m) | 307 | 38.36
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n^2)_Space_O(n2) | 182 | 92.16
| 0044 |[Wildcard Matching](src/main/kotlin/g0001_0100/s0044_wildcard_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Greedy, Recursion | 220 | 84.85
| 0010 |[Regular Expression Matching](src/main/kotlin/g0001_0100/s0010_regular_expression_matching/Solution.kt)| Hard | Top_Interview_Questions, String, Dynamic_Programming, Recursion, Big_O_Time_O(m\*n)_Space_O(m\*n) | 171 | 85.26

#### Udemy Backtracking/Recursion

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Big_O_Time_O(2^n)_Space_O(n) | 161 | 85.45
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 226 | 88.89
| 0216 |[Combination Sum III](src/main/kotlin/g0201_0300/s0216_combination_sum_iii/Solution.kt)| Medium | Array, Backtracking, LeetCode_75_Backtracking | 175 | 90.91
| 0078 |[Subsets](src/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Big_O_Time_O(2^n)_Space_O(n\*2^n) | 171 | 94.92
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, LeetCode_75_Backtracking, Big_O_Time_O(4^n)_Space_O(n) | 155 | 95.24
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 188 | 99.00

#### Udemy Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44
| 0389 |[Find the Difference](src/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 256 | 64.81
| 0190 |[Reverse Bits](src/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 198 | 81.82
| 0461 |[Hamming Distance](src/main/kotlin/g0401_0500/s0461_hamming_distance/Solution.kt)| Easy | Bit_Manipulation | 150 | 96.15
| 1009 |[Complement of Base 10 Integer](src/main/kotlin/g1001_1100/s1009_complement_of_base_10_integer/Solution.kt)| Easy | Bit_Manipulation | 126 | 72.73
| 0338 |[Counting Bits](src/main/kotlin/g0301_0400/s0338_counting_bits/Solution.kt)| Easy | Dynamic_Programming, Bit_Manipulation, LeetCode_75_Bit_Manipulation, Big_O_Time_O(num)_Space_O(num) | 186 | 99.26
| 0371 |[Sum of Two Integers](src/main/kotlin/g0301_0400/s0371_sum_of_two_integers/Solution.kt)| Medium | Math, Bit_Manipulation | 129 | 95.45
| 0029 |[Divide Two Integers](src/main/kotlin/g0001_0100/s0029_divide_two_integers/Solution.kt)| Medium | Top_Interview_Questions, Math, Bit_Manipulation | 144 | 82.50

#### Udemy Design

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 331 | 84.88

### Top Interview 150

#### Top Interview 150 Array/String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0088 |[Merge Sorted Array](src/main/kotlin/g0001_0100/s0088_merge_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers | 170 | 69.74
| 0027 |[Remove Element](src/main/kotlin/g0001_0100/s0027_remove_element/Solution.kt)| Easy | Array, Two_Pointers | 162 | 76.44
| 0026 |[Remove Duplicates from Sorted Array](src/main/kotlin/g0001_0100/s0026_remove_duplicates_from_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Two_Pointers | 249 | 67.38
| 0080 |[Remove Duplicates from Sorted Array II](src/main/kotlin/g0001_0100/s0080_remove_duplicates_from_sorted_array_ii/Solution.kt)| Medium | Array, Two_Pointers | 192 | 80.67
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 460 | 51.25
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 483 | 86.95
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 609 | 94.06
| 0122 |[Best Time to Buy and Sell Stock II](src/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 332 | 89.35
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 208 | 93.37
| 0274 |[H-Index](src/main/kotlin/g0201_0300/s0274_h_index/Solution.kt)| Medium | Array, Sorting, Counting_Sort | 291 | 45.45
| 0380 |[Insert Delete GetRandom O(1)](src/main/kotlin/g0301_0400/s0380_insert_delete_getrandom_o1/RandomizedSet.kt)| Medium | Array, Hash_Table, Math, Design, Randomized | 1326 | 68.23
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Prefix_Sum, LeetCode_75_Array/String, Big_O_Time_O(n^2)_Space_O(n) | 669 | 48.96
| 0134 |[Gas Station](src/main/kotlin/g0101_0200/s0134_gas_station/Solution.kt)| Medium | Top_Interview_Questions, Array, Greedy | 545 | 70.18
| 0135 |[Candy](src/main/kotlin/g0101_0200/s0135_candy/Solution.kt)| Hard | Array, Greedy | 466 | 58.33
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(1) | 189 | 99.37
| 0013 |[Roman to Integer](src/main/kotlin/g0001_0100/s0013_roman_to_integer/Solution.kt)| Easy | Top_Interview_Questions, String, Hash_Table, Math, Big_O_Time_O(n)_Space_O(1) | 211 | 83.47
| 0012 |[Integer to Roman](src/main/kotlin/g0001_0100/s0012_integer_to_roman/Solution.kt)| Medium | String, Hash_Table, Math, Big_O_Time_O(1)_Space_O(1) | 180 | 98.25
| 0058 |[Length of Last Word](src/main/kotlin/g0001_0100/s0058_length_of_last_word/Solution.kt)| Easy | String | 135 | 93.67
| 0014 |[Longest Common Prefix](src/main/kotlin/g0001_0100/s0014_longest_common_prefix/Solution.kt)| Easy | Top_Interview_Questions, String, Big_O_Time_O(n\*m)_Space_O(m) | 154 | 89.70
| 0151 |[Reverse Words in a String](src/main/kotlin/g0101_0200/s0151_reverse_words_in_a_string/Solution.kt)| Medium | String, Two_Pointers, LeetCode_75_Array/String | 206 | 98.90
| 0006 |[Zigzag Conversion](src/main/kotlin/g0001_0100/s0006_zigzag_conversion/Solution.kt)| Medium | String, Big_O_Time_O(n)_Space_O(n) | 200 | 97.79
| 0028 |[Find the Index of the First Occurrence in a String](src/main/kotlin/g0001_0100/s0028_find_the_index_of_the_first_occurrence_in_a_string/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers, String_Matching | 126 | 97.58
| 0068 |[Text Justification](src/main/kotlin/g0001_0100/s0068_text_justification/Solution.kt)| Hard | Array, String, Simulation | 153 | 92.96

#### Top Interview 150 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0125 |[Valid Palindrome](src/main/kotlin/g0101_0200/s0125_valid_palindrome/Solution.kt)| Easy | Top_Interview_Questions, String, Two_Pointers | 353 | 52.06
| 0392 |[Is Subsequence](src/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers, LeetCode_75_Two_Pointers | 156 | 87.74
| 0167 |[Two Sum II - Input Array Is Sorted](src/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74
| 0011 |[Container With Most Water](src/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, LeetCode_75_Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 402 | 78.57
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 493 | 93.45

#### Top Interview 150 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0209 |[Minimum Size Subarray Sum](src/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 315 | 96.73
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1), AI_can_be_used_to_solve_the_task | 3 | 99.17
| 0030 |[Substring with Concatenation of All Words](src/main/kotlin/g0001_0100/s0030_substring_with_concatenation_of_all_words/Solution.kt)| Hard | String, Hash_Table, Sliding_Window | 14 | 98.62
| 0076 |[Minimum Window Substring](src/main/kotlin/g0001_0100/s0076_minimum_window_substring/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(s.length())_Space_O(1) | 191 | 96.38

#### Top Interview 150 Matrix

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 181 | 95.15
| 0054 |[Spiral Matrix](src/main/kotlin/g0001_0100/s0054_spiral_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Simulation | 132 | 95.12
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 160 | 90.11
| 0073 |[Set Matrix Zeroes](src/main/kotlin/g0001_0100/s0073_set_matrix_zeroes/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Matrix, Big_O_Time_O(m\*n)_Space_O(1) | 248 | 97.33
| 0289 |[Game of Life](src/main/kotlin/g0201_0300/s0289_game_of_life/Solution.kt)| Medium | Array, Matrix, Simulation | 174 | 96.97

#### Top Interview 150 Hashmap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0383 |[Ransom Note](src/main/kotlin/g0301_0400/s0383_ransom_note/Solution.kt)| Easy | String, Hash_Table, Counting | 333 | 79.58
| 0205 |[Isomorphic Strings](src/main/kotlin/g0201_0300/s0205_isomorphic_strings/Solution.kt)| Easy | String, Hash_Table | 278 | 79.96
| 0290 |[Word Pattern](src/main/kotlin/g0201_0300/s0290_word_pattern/Solution.kt)| Easy | String, Hash_Table | 177 | 89.55
| 0242 |[Valid Anagram](src/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | String, Hash_Table, Sorting | 251 | 87.65
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 308 | 96.34
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n), AI_can_be_used_to_solve_the_task | 2 | 98.77
| 0202 |[Happy Number](src/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0219 |[Contains Duplicate II](src/main/kotlin/g0201_0300/s0219_contains_duplicate_ii/Solution.kt)| Easy | Array, Hash_Table, Sliding_Window | 813 | 80.46
| 0128 |[Longest Consecutive Sequence](src/main/kotlin/g0101_0200/s0128_longest_consecutive_sequence/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Union_Find, Big_O_Time_O(N_log_N)_Space_O(1) | 460 | 97.77

#### Top Interview 150 Intervals

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0228 |[Summary Ranges](src/main/kotlin/g0201_0300/s0228_summary_ranges/Solution.kt)| Easy | Array | 169 | 91.89
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 334 | 80.67
| 0057 |[Insert Interval](src/main/kotlin/g0001_0100/s0057_insert_interval/Solution.kt)| Medium | Array | 249 | 75.63
| 0452 |[Minimum Number of Arrows to Burst Balloons](src/main/kotlin/g0401_0500/s0452_minimum_number_of_arrows_to_burst_balloons/Solution.kt)| Medium | Array, Sorting, Greedy, LeetCode_75_Intervals | 934 | 100.00

#### Top Interview 150 Stack

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Big_O_Time_O(n)_Space_O(n) | 137 | 88.76
| 0071 |[Simplify Path](src/main/kotlin/g0001_0100/s0071_simplify_path/Solution.kt)| Medium | String, Stack | 185 | 92.86
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 331 | 84.88
| 0150 |[Evaluate Reverse Polish Notation](src/main/kotlin/g0101_0200/s0150_evaluate_reverse_polish_notation/Solution.kt)| Medium | Top_Interview_Questions, Array, Math, Stack | 233 | 88.82
| 0224 |[Basic Calculator](src/main/kotlin/g0201_0300/s0224_basic_calculator/Solution.kt)| Hard | String, Math, Stack, Recursion | 294 | 93.33

#### Top Interview 150 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 223 | 91.85
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Big_O_Time_O(max(N,M))_Space_O(max(N,M)), AI_can_be_used_to_solve_the_task | 2 | 87.63
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 157 | 92.24
| 0138 |[Copy List with Random Pointer](src/main/kotlin/g0101_0200/s0138_copy_list_with_random_pointer/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Linked_List, Big_O_Time_O(N)_Space_O(N) | 123 | 90.70
| 0092 |[Reverse Linked List II](src/main/kotlin/g0001_0100/s0092_reverse_linked_list_ii/Solution.kt)| Medium | Linked_List | 144 | 75.00
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(k) | 189 | 67.03
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Big_O_Time_O(L)_Space_O(L) | 144 | 96.28
| 0082 |[Remove Duplicates from Sorted List II](src/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List | 166 | 89.47
| 0061 |[Rotate List](src/main/kotlin/g0001_0100/s0061_rotate_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 160 | 92.22
| 0086 |[Partition List](src/main/kotlin/g0001_0100/s0086_partition_list/Solution.kt)| Medium | Two_Pointers, Linked_List | 160 | 70.73
| 0146 |[LRU Cache](src/main/kotlin/g0101_0200/s0146_lru_cache/LRUCache.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Design, Linked_List, Doubly_Linked_List, Big_O_Time_O(1)_Space_O(capacity) | 1116 | 97.93

#### Top Interview 150 Binary Tree General

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0104 |[Maximum Depth of Binary Tree](src/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(N)_Space_O(H) | 166 | 83.53
| 0100 |[Same Tree](src/main/kotlin/g0001_0100/s0100_same_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 134 | 86.63
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 233 | 54.90
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 153 | 82.35
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Big_O_Time_O(N)_Space_O(N) | 183 | 95.45
| 0106 |[Construct Binary Tree from Inorder and Postorder Traversal](src/main/kotlin/g0101_0200/s0106_construct_binary_tree_from_inorder_and_postorder_traversal/Solution.kt)| Medium | Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer | 167 | 100.00
| 0117 |[Populating Next Right Pointers in Each Node II](src/main/kotlin/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 199 | 94.67
| 0114 |[Flatten Binary Tree to Linked List](src/main/kotlin/g0101_0200/s0114_flatten_binary_tree_to_linked_list/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Linked_List, Big_O_Time_O(N)_Space_O(N) | 191 | 93.10
| 0112 |[Path Sum](src/main/kotlin/g0101_0200/s0112_path_sum/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 322 | 36.41
| 0129 |[Sum Root to Leaf Numbers](src/main/kotlin/g0101_0200/s0129_sum_root_to_leaf_numbers/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree | 237 | 52.50
| 0124 |[Binary Tree Maximum Path Sum](src/main/kotlin/g0101_0200/s0124_binary_tree_maximum_path_sum/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Depth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 331 | 74.42
| 0173 |[Binary Search Tree Iterator](src/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91
| 0222 |[Count Complete Tree Nodes](src/main/kotlin/g0201_0300/s0222_count_complete_tree_nodes/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Search, Binary_Tree | 0 | 100.00
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(n)_Space_O(n) | 386 | 45.21

#### Top Interview 150 Binary Tree BFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/BFS | 194 | 92.89
| 0637 |[Average of Levels in Binary Tree](src/main/kotlin/g0601_0700/s0637_average_of_levels_in_binary_tree/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 249 | 100.00
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 198 | 95.14
| 0103 |[Binary Tree Zigzag Level Order Traversal](src/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 176 | 71.62

#### Top Interview 150 Binary Search Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0530 |[Minimum Absolute Difference in BST](src/main/kotlin/g0501_0600/s0530_minimum_absolute_difference_in_bst/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 209 | 86.96
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(n) | 393 | 33.33
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 190 | 61.62

#### Top Interview 150 Graph General

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 252 | 95.41
| 0130 |[Surrounded Regions](src/main/kotlin/g0101_0200/s0130_surrounded_regions/Solution.kt)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 355 | 84.42
| 0133 |[Clone Graph](src/main/kotlin/g0101_0200/s0133_clone_graph/Solution.kt)| Medium | Hash_Table, Depth_First_Search, Breadth_First_Search, Graph | 351 | 60.91
| 0399 |[Evaluate Division](src/main/kotlin/g0301_0400/s0399_evaluate_division/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Graph, Union_Find, Shortest_Path, LeetCode_75_Graphs/DFS | 183 | 91.49
| 0207 |[Course Schedule](src/main/kotlin/g0201_0300/s0207_course_schedule/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort, Big_O_Time_O(N)_Space_O(N) | 183 | 92.07
| 0210 |[Course Schedule II](src/main/kotlin/g0201_0300/s0210_course_schedule_ii/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Graph, Topological_Sort | 266 | 96.32

#### Top Interview 150 Graph BFS

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0909 |[Snakes and Ladders](src/main/kotlin/g0901_1000/s0909_snakes_and_ladders/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 203 | 100.00
| 0433 |[Minimum Genetic Mutation](src/main/kotlin/g0401_0500/s0433_minimum_genetic_mutation/Solution.kt)| Medium | String, Hash_Table, Breadth_First_Search | 204 | 82.08
| 0127 |[Word Ladder](src/main/kotlin/g0101_0200/s0127_word_ladder/Solution.kt)| Hard | Top_Interview_Questions, String, Hash_Table, Breadth_First_Search | 396 | 98.68

#### Top Interview 150 Trie

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0208 |[Implement Trie (Prefix Tree)](src/main/kotlin/g0201_0300/s0208_implement_trie_prefix_tree/Trie.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Design, Trie, LeetCode_75_Trie, Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N) | 689 | 61.00
| 0211 |[Design Add and Search Words Data Structure](src/main/kotlin/g0201_0300/s0211_design_add_and_search_words_data_structure/WordDictionary.kt)| Medium | String, Depth_First_Search, Design, Trie | 2256 | 87.04
| 0212 |[Word Search II](src/main/kotlin/g0201_0300/s0212_word_search_ii/Solution.kt)| Hard | Top_Interview_Questions, Array, String, Matrix, Backtracking, Trie | 268 | 100.00

#### Top Interview 150 Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, LeetCode_75_Backtracking, Big_O_Time_O(4^n)_Space_O(n) | 155 | 95.24
| 0077 |[Combinations](src/main/kotlin/g0001_0100/s0077_combinations/Solution.kt)| Medium | Backtracking | 232 | 100.00
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 188 | 99.00
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 226 | 88.89
| 0052 |[N-Queens II](src/main/kotlin/g0001_0100/s0052_n_queens_ii/Solution.kt)| Hard | Backtracking | 128 | 97.56
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Big_O_Time_O(2^n)_Space_O(n) | 161 | 85.45
| 0079 |[Word Search](src/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Big_O_Time_O(4^(m\*n))_Space_O(m\*n) | 392 | 72.92

#### Top Interview 150 Divide and Conquer

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 167 | 80.29
| 0148 |[Sort List](src/main/kotlin/g0101_0200/s0148_sort_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Sorting, Two_Pointers, Linked_List, Divide_and_Conquer, Merge_Sort, Big_O_Time_O(log(N))_Space_O(log(N)) | 820 | 61.70
| 0427 |[Construct Quad Tree](src/main/kotlin/g0401_0500/s0427_construct_quad_tree/Solution.kt)| Medium | Array, Tree, Matrix, Divide_and_Conquer | 221 | 94.74
| 0023 |[Merge k Sorted Lists](src/main/kotlin/g0001_0100/s0023_merge_k_sorted_lists/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Heap_Priority_Queue, Linked_List, Divide_and_Conquer, Merge_Sort, Big_O_Time_O(k\*n\*log(k))_Space_O(log(k)) | 198 | 93.77

#### Top Interview 150 Kadane's Algorithm

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 510 | 78.81
| 0918 |[Maximum Sum Circular Subarray](src/main/kotlin/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue | 339 | 86.96

#### Top Interview 150 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 159 | 93.03
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46
| 0162 |[Find Peak Element](src/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search, LeetCode_75_Binary_Search | 297 | 53.85
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 151 | 93.77
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 174 | 100.00
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 262 | 60.96
| 0004 |[Median of Two Sorted Arrays](src/main/kotlin/g0001_0100/s0004_median_of_two_sorted_arrays/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Divide_and_Conquer, Big_O_Time_O(log(min(N,M)))_Space_O(1), AI_can_be_used_to_solve_the_task | 2 | 99.23

#### Top Interview 150 Heap

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, LeetCode_75_Heap/Priority_Queue, Big_O_Time_O(n\*log(n))_Space_O(log(n)) | 839 | 34.43
| 0502 |[IPO](src/main/kotlin/g0501_0600/s0502_ipo/Solution.kt)| Hard | Array, Sorting, Greedy, Heap_Priority_Queue | 799 | 54.55
| 0373 |[Find K Pairs with Smallest Sums](src/main/kotlin/g0301_0400/s0373_find_k_pairs_with_smallest_sums/Solution.kt)| Medium | Array, Heap_Priority_Queue | 1809 | 80.95
| 0295 |[Find Median from Data Stream](src/main/kotlin/g0201_0300/s0295_find_median_from_data_stream/MedianFinder.kt)| Hard | Top_100_Liked_Questions, Sorting, Two_Pointers, Design, Heap_Priority_Queue, Data_Stream, Big_O_Time_O(n\*log_n)_Space_O(n) | 2289 | 33.60

#### Top Interview 150 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0067 |[Add Binary](src/main/kotlin/g0001_0100/s0067_add_binary/Solution.kt)| Easy | String, Math, Bit_Manipulation, Simulation | 164 | 90.60
| 0190 |[Reverse Bits](src/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 198 | 81.82
| 0191 |[Number of 1 Bits](src/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, LeetCode_75_Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 344 | 83.63
| 0137 |[Single Number II](src/main/kotlin/g0101_0200/s0137_single_number_ii/Solution.kt)| Medium | Array, Bit_Manipulation | 344 | 64.29
| 0201 |[Bitwise AND of Numbers Range](src/main/kotlin/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.kt)| Medium | Bit_Manipulation | 368 | 80.00

#### Top Interview 150 Math

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0009 |[Palindrome Number](src/main/kotlin/g0001_0100/s0009_palindrome_number/Solution.kt)| Easy | Math, Big_O_Time_O(log10(x))_Space_O(1) | 217 | 95.34
| 0066 |[Plus One](src/main/kotlin/g0001_0100/s0066_plus_one/Solution.kt)| Easy | Top_Interview_Questions, Array, Math | 148 | 98.75
| 0172 |[Factorial Trailing Zeroes](src/main/kotlin/g0101_0200/s0172_factorial_trailing_zeroes/Solution.kt)| Medium | Top_Interview_Questions, Math | 220 | 67.65
| 0069 |[Sqrt(x)](src/main/kotlin/g0001_0100/s0069_sqrtx/Solution.kt)| Easy | Top_Interview_Questions, Math, Binary_Search | 140 | 94.72
| 0050 |[Pow(x, n)](src/main/kotlin/g0001_0100/s0050_powx_n/Solution.kt)| Medium | Top_Interview_Questions, Math, Recursion | 172 | 38.68
| 0149 |[Max Points on a Line](src/main/kotlin/g0101_0200/s0149_max_points_on_a_line/Solution.kt)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry | 307 | 83.33

#### Top Interview 150 1D DP

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 124 | 71.98
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, LeetCode_75_DP/1D, Big_O_Time_O(n)_Space_O(n) | 156 | 92.24
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 197 | 87.17
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 332 | 50.68
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 318 | 82.28

#### Top Interview 150 Multidimensional DP

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0120 |[Triangle](src/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 164 | 100.00
| 0063 |[Unique Paths II](src/main/kotlin/g0001_0100/s0063_unique_paths_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 151 | 81.94
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 8 | 96.61
| 0097 |[Interleaving String](src/main/kotlin/g0001_0100/s0097_interleaving_string/Solution.kt)| Medium | String, Dynamic_Programming | 149 | 81.58
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n^2)_Space_O(n2) | 182 | 92.16
| 0123 |[Best Time to Buy and Sell Stock III](src/main/kotlin/g0101_0200/s0123_best_time_to_buy_and_sell_stock_iii/Solution.kt)| Hard | Array, Dynamic_Programming | 585 | 95.24
| 0188 |[Best Time to Buy and Sell Stock IV](src/main/kotlin/g0101_0200/s0188_best_time_to_buy_and_sell_stock_iv/Solution.kt)| Hard | Array, Dynamic_Programming | 293 | 68.31
| 0221 |[Maximal Square](src/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 614 | 44.00

### Data Structure I

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0217 |[Contains Duplicate](src/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 510 | 78.81

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0001 |[Two Sum](src/main/kotlin/g0001_0100/s0001_two_sum/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Big_O_Time_O(n)_Space_O(n), AI_can_be_used_to_solve_the_task | 2 | 98.77
| 0088 |[Merge Sorted Array](src/main/kotlin/g0001_0100/s0088_merge_sorted_array/Solution.kt)| Easy | Top_Interview_Questions, Array, Sorting, Two_Pointers | 170 | 69.74

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 321 | 73.37
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 609 | 94.06

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0566 |[Reshape the Matrix](src/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 239 | 99.05
| 0118 |[Pascal's Triangle](src/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0036 |[Valid Sudoku](src/main/kotlin/g0001_0100/s0036_valid_sudoku/Solution.kt)| Medium | Top_Interview_Questions, Array, Hash_Table, Matrix | 181 | 95.15
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0387 |[First Unique Character in a String](src/main/kotlin/g0301_0400/s0387_first_unique_character_in_a_string/Solution.kt)| Easy | String, Hash_Table, Counting, Queue | 369 | 82.68
| 0383 |[Ransom Note](src/main/kotlin/g0301_0400/s0383_ransom_note/Solution.kt)| Easy | String, Hash_Table, Counting | 333 | 79.58
| 0242 |[Valid Anagram](src/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | String, Hash_Table, Sorting | 251 | 87.65

#### Day 7 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0141 |[Linked List Cycle](src/main/kotlin/g0101_0200/s0141_linked_list_cycle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 223 | 91.85
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 157 | 92.24
| 0203 |[Remove Linked List Elements](src/main/kotlin/g0201_0300/s0203_remove_linked_list_elements/Solution.kt)| Easy | Linked_List, Recursion | 233 | 91.22

#### Day 8 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, LeetCode_75_LinkedList, Big_O_Time_O(N)_Space_O(1) | 279 | 45.78
| 0083 |[Remove Duplicates from Sorted List](src/main/kotlin/g0001_0100/s0083_remove_duplicates_from_sorted_list/Solution.kt)| Easy | Linked_List | 173 | 82.42

#### Day 9 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0020 |[Valid Parentheses](src/main/kotlin/g0001_0100/s0020_valid_parentheses/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, String, Stack, Big_O_Time_O(n)_Space_O(n) | 137 | 88.76
| 0232 |[Implement Queue using Stacks](src/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86

#### Day 10 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0144 |[Binary Tree Preorder Traversal](src/main/kotlin/g0101_0200/s0144_binary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 277 | 37.90
| 0094 |[Binary Tree Inorder Traversal](src/main/kotlin/g0001_0100/s0094_binary_tree_inorder_traversal/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Stack, Big_O_Time_O(n)_Space_O(n) | 152 | 66.67
| 0145 |[Binary Tree Postorder Traversal](src/main/kotlin/g0101_0200/s0145_binary_tree_postorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Stack | 211 | 80.00

#### Day 11 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0102 |[Binary Tree Level Order Traversal](src/main/kotlin/g0101_0200/s0102_binary_tree_level_order_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(N) | 198 | 95.14
| 0104 |[Maximum Depth of Binary Tree](src/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(N)_Space_O(H) | 166 | 83.53
| 0101 |[Symmetric Tree](src/main/kotlin/g0101_0200/s0101_symmetric_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 153 | 82.35

#### Day 12 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0226 |[Invert Binary Tree](src/main/kotlin/g0201_0300/s0226_invert_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Big_O_Time_O(n)_Space_O(n) | 233 | 54.90
| 0112 |[Path Sum](src/main/kotlin/g0101_0200/s0112_path_sum/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 322 | 36.41

#### Day 13 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0700 |[Search in a Binary Search Tree](src/main/kotlin/g0601_0700/s0700_search_in_a_binary_search_tree/Solution.kt)| Easy | Tree, Binary_Tree, Binary_Search_Tree, LeetCode_75_Binary_Search_Tree | 251 | 88.31
| 0701 |[Insert into a Binary Search Tree](src/main/kotlin/g0701_0800/s0701_insert_into_a_binary_search_tree/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree | 311 | 79.03

#### Day 14 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0098 |[Validate Binary Search Tree](src/main/kotlin/g0001_0100/s0098_validate_binary_search_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(N)_Space_O(log(N)) | 190 | 61.62
| 0653 |[Two Sum IV - Input is a BST](src/main/kotlin/g0601_0700/s0653_two_sum_iv_input_is_a_bst/Solution.kt)| Easy | Hash_Table, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Two_Pointers, Binary_Search_Tree | 231 | 96.08
| 0235 |[Lowest Common Ancestor of a Binary Search Tree](src/main/kotlin/g0201_0300/s0235_lowest_common_ancestor_of_a_binary_search_tree/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree | 404 | 75.59

### Data Structure II

#### Day 1 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, LeetCode_75_Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 344 | 83.63
| 0169 |[Majority Element](src/main/kotlin/g0101_0200/s0169_majority_element/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Sorting, Counting, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 460 | 51.25
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 493 | 93.45

#### Day 2 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0075 |[Sort Colors](src/main/kotlin/g0001_0100/s0075_sort_colors/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 164 | 64.43
| 0056 |[Merge Intervals](src/main/kotlin/g0001_0100/s0056_merge_intervals/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Big_O_Time_O(n_log_n)_Space_O(n) | 334 | 80.67
| 0706 |[Design HashMap](src/main/kotlin/g0701_0800/s0706_design_hashmap/MyHashMap.kt)| Easy | Array, Hash_Table, Design, Linked_List, Hash_Function | 405 | 92.11

#### Day 3 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0119 |[Pascal's Triangle II](src/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27
| 0048 |[Rotate Image](src/main/kotlin/g0001_0100/s0048_rotate_image/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Matrix, Big_O_Time_O(n^2)_Space_O(1) | 160 | 90.11
| 0059 |[Spiral Matrix II](src/main/kotlin/g0001_0100/s0059_spiral_matrix_ii/Solution.kt)| Medium | Array, Matrix, Simulation | 153 | 41.70

#### Day 4 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Big_O_Time_O(n+m)_Space_O(1) | 460 | 66.08
| 0435 |[Non-overlapping Intervals](src/main/kotlin/g0401_0500/s0435_non_overlapping_intervals/Solution.kt)| Medium | Array, Dynamic_Programming, Sorting, Greedy, LeetCode_75_Intervals | 1040 | 85.07

#### Day 5 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0334 |[Increasing Triplet Subsequence](src/main/kotlin/g0301_0400/s0334_increasing_triplet_subsequence/Solution.kt)| Medium | Array, Greedy, LeetCode_75_Array/String | 672 | 60.61
| 0238 |[Product of Array Except Self](src/main/kotlin/g0201_0300/s0238_product_of_array_except_self/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Prefix_Sum, LeetCode_75_Array/String, Big_O_Time_O(n^2)_Space_O(n) | 669 | 48.96
| 0560 |[Subarray Sum Equals K](src/main/kotlin/g0501_0600/s0560_subarray_sum_equals_k/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Prefix_Sum, Big_O_Time_O(n)_Space_O(n) | 692 | 53.27

#### Day 6 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0415 |[Add Strings](src/main/kotlin/g0401_0500/s0415_add_strings/Solution.kt)| Easy | String, Math, Simulation | 296 | 76.00
| 0409 |[Longest Palindrome](src/main/kotlin/g0401_0500/s0409_longest_palindrome/Solution.kt)| Easy | String, Hash_Table, Greedy | 259 | 60.71

#### Day 7 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0290 |[Word Pattern](src/main/kotlin/g0201_0300/s0290_word_pattern/Solution.kt)| Easy | String, Hash_Table | 177 | 89.55
| 0763 |[Partition Labels](src/main/kotlin/g0701_0800/s0763_partition_labels/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Greedy, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 235 | 84.75

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0049 |[Group Anagrams](src/main/kotlin/g0001_0100/s0049_group_anagrams/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, String, Hash_Table, Sorting, Big_O_Time_O(n\*k_log_k)_Space_O(n) | 308 | 96.34
| 0043 |[Multiply Strings](src/main/kotlin/g0001_0100/s0043_multiply_strings/Solution.kt)| Medium | String, Math, Simulation | 165 | 96.72

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0187 |[Repeated DNA Sequences](src/main/kotlin/g0101_0200/s0187_repeated_dna_sequences/Solution.kt)| Medium | String, Hash_Table, Bit_Manipulation, Sliding_Window, Hash_Function, Rolling_Hash | 319 | 79.03
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 8 | 96.61

#### Day 10 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0002 |[Add Two Numbers](src/main/kotlin/g0001_0100/s0002_add_two_numbers/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Math, Linked_List, Recursion, Big_O_Time_O(max(N,M))_Space_O(max(N,M)), AI_can_be_used_to_solve_the_task | 2 | 87.63
| 0142 |[Linked List Cycle II](src/main/kotlin/g0101_0200/s0142_linked_list_cycle_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(N)_Space_O(1) | 192 | 63.39

#### Day 11 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0160 |[Intersection of Two Linked Lists](src/main/kotlin/g0101_0200/s0160_intersection_of_two_linked_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Hash_Table, Two_Pointers, Linked_List, Big_O_Time_O(M+N)_Space_O(1) | 262 | 83.50
| 0082 |[Remove Duplicates from Sorted List II](src/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List | 166 | 89.47

#### Day 12 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0024 |[Swap Nodes in Pairs](src/main/kotlin/g0001_0100/s0024_swap_nodes_in_pairs/Solution.kt)| Medium | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(1) | 149 | 44.20
| 0707 |[Design Linked List](src/main/kotlin/g0701_0800/s0707_design_linked_list/MyLinkedList.kt)| Medium | Design, Linked_List | 243 | 100.00

#### Day 13 Linked List

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0025 |[Reverse Nodes in k-Group](src/main/kotlin/g0001_0100/s0025_reverse_nodes_in_k_group/Solution.kt)| Hard | Top_100_Liked_Questions, Linked_List, Recursion, Big_O_Time_O(n)_Space_O(k) | 189 | 67.03
| 0143 |[Reorder List](src/main/kotlin/g0101_0200/s0143_reorder_list/Solution.kt)| Medium | Two_Pointers, Stack, Linked_List, Recursion | 395 | 82.26

#### Day 14 Stack Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0155 |[Min Stack](src/main/kotlin/g0101_0200/s0155_min_stack/MinStack.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Stack, Design, Big_O_Time_O(1)_Space_O(N) | 331 | 84.88
| 1249 |[Minimum Remove to Make Valid Parentheses](src/main/kotlin/g1201_1300/s1249_minimum_remove_to_make_valid_parentheses/Solution.kt)| Medium | String, Stack | 218 | 100.00
| 1823 |[Find the Winner of the Circular Game](src/main/kotlin/g1801_1900/s1823_find_the_winner_of_the_circular_game/Solution.kt)| Medium | Array, Math, Simulation, Recursion, Queue | 119 | 87.50

#### Day 15 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0108 |[Convert Sorted Array to Binary Search Tree](src/main/kotlin/g0101_0200/s0108_convert_sorted_array_to_binary_search_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Tree, Binary_Tree, Binary_Search_Tree, Divide_and_Conquer | 167 | 80.29
| 0105 |[Construct Binary Tree from Preorder and Inorder Traversal](src/main/kotlin/g0101_0200/s0105_construct_binary_tree_from_preorder_and_inorder_traversal/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Hash_Table, Tree, Binary_Tree, Divide_and_Conquer, Big_O_Time_O(N)_Space_O(N) | 183 | 95.45
| 0103 |[Binary Tree Zigzag Level Order Traversal](src/main/kotlin/g0101_0200/s0103_binary_tree_zigzag_level_order_traversal/Solution.kt)| Medium | Top_Interview_Questions, Breadth_First_Search, Tree, Binary_Tree | 176 | 71.62

#### Day 16 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0199 |[Binary Tree Right Side View](src/main/kotlin/g0101_0200/s0199_binary_tree_right_side_view/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/BFS | 194 | 92.89
| 0113 |[Path Sum II](src/main/kotlin/g0101_0200/s0113_path_sum_ii/Solution.kt)| Medium | Depth_First_Search, Tree, Binary_Tree, Backtracking | 364 | 78.67
| 0450 |[Delete Node in a BST](src/main/kotlin/g0401_0500/s0450_delete_node_in_a_bst/Solution.kt)| Medium | Tree, Binary_Tree, Binary_Search_Tree, LeetCode_75_Binary_Search_Tree | 257 | 84.62

#### Day 17 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0230 |[Kth Smallest Element in a BST](src/main/kotlin/g0201_0300/s0230_kth_smallest_element_in_a_bst/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(n) | 393 | 33.33
| 0173 |[Binary Search Tree Iterator](src/main/kotlin/g0101_0200/s0173_binary_search_tree_iterator/BSTIterator.kt)| Medium | Tree, Binary_Tree, Stack, Design, Binary_Search_Tree, Iterator | 563 | 46.91

#### Day 18 Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0236 |[Lowest Common Ancestor of a Binary Tree](src/main/kotlin/g0201_0300/s0236_lowest_common_ancestor_of_a_binary_tree/Solution.kt)| Medium | Top_100_Liked_Questions, Depth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(n)_Space_O(n) | 386 | 45.21
| 0297 |[Serialize and Deserialize Binary Tree](src/main/kotlin/g0201_0300/s0297_serialize_and_deserialize_binary_tree/Codec.kt)| Hard | String, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Design | 475 | 78.85

#### Day 19 Graph

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0997 |[Find the Town Judge](src/main/kotlin/g0901_1000/s0997_find_the_town_judge/Solution.kt)| Easy | Array, Hash_Table, Graph | 475 | 58.62
| 1557 |[Minimum Number of Vertices to Reach All Nodes](src/main/kotlin/g1501_1600/s1557_minimum_number_of_vertices_to_reach_all_nodes/Solution.kt)| Medium | Graph | 792 | 99.29
| 0841 |[Keys and Rooms](src/main/kotlin/g0801_0900/s0841_keys_and_rooms/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, LeetCode_75_Graphs/DFS | 189 | 69.23

#### Day 20 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0215 |[Kth Largest Element in an Array](src/main/kotlin/g0201_0300/s0215_kth_largest_element_in_an_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Quickselect, LeetCode_75_Heap/Priority_Queue, Big_O_Time_O(n\*log(n))_Space_O(log(n)) | 839 | 34.43
| 0347 |[Top K Frequent Elements](src/main/kotlin/g0301_0400/s0347_top_k_frequent_elements/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Divide_and_Conquer, Quickselect, Bucket_Sort, Big_O_Time_O(n\*log(n))_Space_O(k) | 268 | 99.74

#### Day 21 Heap Priority Queue

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0451 |[Sort Characters By Frequency](src/main/kotlin/g0401_0500/s0451_sort_characters_by_frequency/Solution.kt)| Medium | String, Hash_Table, Sorting, Heap_Priority_Queue, Counting, Bucket_Sort | 288 | 81.72
| 0973 |[K Closest Points to Origin](src/main/kotlin/g0901_1000/s0973_k_closest_points_to_origin/Solution.kt)| Medium | Array, Math, Sorting, Heap_Priority_Queue, Divide_and_Conquer, Geometry, Quickselect | 800 | 37.89

### Algorithm I

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0278 |[First Bad Version](src/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 159 | 93.03

#### Day 2 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0977 |[Squares of a Sorted Array](src/main/kotlin/g0901_1000/s0977_squares_of_a_sorted_array/Solution.kt)| Easy | Array, Sorting, Two_Pointers | 271 | 77.17
| 0189 |[Rotate Array](src/main/kotlin/g0101_0200/s0189_rotate_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Math, Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 483 | 86.95

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Two_Pointers, LeetCode_75_Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 516 | 79.07
| 0167 |[Two Sum II - Input Array Is Sorted](src/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0344 |[Reverse String](src/main/kotlin/g0301_0400/s0344_reverse_string/Solution.kt)| Easy | String, Two_Pointers, Recursion | 445 | 69.75
| 0557 |[Reverse Words in a String III](src/main/kotlin/g0501_0600/s0557_reverse_words_in_a_string_iii/Solution.kt)| Easy | String, Two_Pointers | 215 | 98.10

#### Day 5 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0876 |[Middle of the Linked List](src/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0019 |[Remove Nth Node From End of List](src/main/kotlin/g0001_0100/s0019_remove_nth_node_from_end_of_list/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Two_Pointers, Linked_List, Big_O_Time_O(L)_Space_O(L) | 144 | 96.28

#### Day 6 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0003 |[Longest Substring Without Repeating Characters](src/main/kotlin/g0001_0100/s0003_longest_substring_without_repeating_characters/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n)_Space_O(1), AI_can_be_used_to_solve_the_task | 3 | 99.17
| 0567 |[Permutation in String](src/main/kotlin/g0501_0600/s0567_permutation_in_string/Solution.kt)| Medium | String, Hash_Table, Two_Pointers, Sliding_Window | 169 | 100.00

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0733 |[Flood Fill](src/main/kotlin/g0701_0800/s0733_flood_fill/Solution.kt)| Easy | Array, Depth_First_Search, Breadth_First_Search, Matrix | 230 | 97.76
| 0695 |[Max Area of Island](src/main/kotlin/g0601_0700/s0695_max_area_of_island/Solution.kt)| Medium | Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 181 | 93.83

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0617 |[Merge Two Binary Trees](src/main/kotlin/g0601_0700/s0617_merge_two_binary_trees/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 243 | 72.83
| 0116 |[Populating Next Right Pointers in Each Node](src/main/kotlin/g0101_0200/s0116_populating_next_right_pointers_in_each_node/Solution.kt)| Medium | Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 355 | 69.02

#### Day 9 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0542 |[01 Matrix](src/main/kotlin/g0501_0600/s0542_01_matrix/Solution.kt)| Medium | Array, Dynamic_Programming, Breadth_First_Search, Matrix | 441 | 94.06
| 0994 |[Rotting Oranges](src/main/kotlin/g0901_1000/s0994_rotting_oranges/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Breadth_First_Search, Matrix, LeetCode_75_Graphs/BFS | 164 | 82.95

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0021 |[Merge Two Sorted Lists](src/main/kotlin/g0001_0100/s0021_merge_two_sorted_lists/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, Big_O_Time_O(m+n)_Space_O(m+n) | 157 | 92.24
| 0206 |[Reverse Linked List](src/main/kotlin/g0201_0300/s0206_reverse_linked_list/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Linked_List, Recursion, LeetCode_75_LinkedList, Big_O_Time_O(N)_Space_O(1) | 279 | 45.78

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0077 |[Combinations](src/main/kotlin/g0001_0100/s0077_combinations/Solution.kt)| Medium | Backtracking | 232 | 100.00
| 0046 |[Permutations](src/main/kotlin/g0001_0100/s0046_permutations/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Backtracking, Big_O_Time_O(n\*n!)_Space_O(n+n!) | 188 | 99.00
| 0784 |[Letter Case Permutation](src/main/kotlin/g0701_0800/s0784_letter_case_permutation/Solution.kt)| Medium | String, Bit_Manipulation, Backtracking | 219 | 84.62

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 124 | 71.98
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, LeetCode_75_DP/1D, Big_O_Time_O(n)_Space_O(n) | 156 | 92.24
| 0120 |[Triangle](src/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87

#### Day 13 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0231 |[Power of Two](src/main/kotlin/g0201_0300/s0231_power_of_two/Solution.kt)| Easy | Math, Bit_Manipulation, Recursion | 161 | 86.81
| 0191 |[Number of 1 Bits](src/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44

#### Day 14 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0190 |[Reverse Bits](src/main/kotlin/g0101_0200/s0190_reverse_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation, Divide_and_Conquer | 198 | 81.82
| 0136 |[Single Number](src/main/kotlin/g0101_0200/s0136_single_number/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, LeetCode_75_Bit_Manipulation, Big_O_Time_O(N)_Space_O(1) | 344 | 83.63

### Algorithm II

#### Day 1 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 174 | 100.00
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 151 | 93.77
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46

#### Day 2 Binary Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 262 | 60.96
| 0162 |[Find Peak Element](src/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search, LeetCode_75_Binary_Search | 297 | 53.85

#### Day 3 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0082 |[Remove Duplicates from Sorted List II](src/main/kotlin/g0001_0100/s0082_remove_duplicates_from_sorted_list_ii/Solution.kt)| Medium | Two_Pointers, Linked_List | 166 | 89.47
| 0015 |[3Sum](src/main/kotlin/g0001_0100/s0015_3sum/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Sorting, Two_Pointers, Big_O_Time_O(n\*log(n))_Space_O(n^2) | 493 | 93.45

#### Day 4 Two Pointers

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0844 |[Backspace String Compare](src/main/kotlin/g0801_0900/s0844_backspace_string_compare/Solution.kt)| Easy | String, Two_Pointers, Stack, Simulation | 126 | 98.31
| 0986 |[Interval List Intersections](src/main/kotlin/g0901_1000/s0986_interval_list_intersections/Solution.kt)| Medium | Array, Two_Pointers | 318 | 60.98
| 0011 |[Container With Most Water](src/main/kotlin/g0001_0100/s0011_container_with_most_water/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Greedy, Two_Pointers, LeetCode_75_Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 402 | 78.57

#### Day 5 Sliding Window

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0438 |[Find All Anagrams in a String](src/main/kotlin/g0401_0500/s0438_find_all_anagrams_in_a_string/Solution.kt)| Medium | Top_100_Liked_Questions, String, Hash_Table, Sliding_Window, Big_O_Time_O(n+m)_Space_O(1) | 561 | 54.68
| 0713 |[Subarray Product Less Than K](src/main/kotlin/g0701_0800/s0713_subarray_product_less_than_k/Solution.kt)| Medium | Array, Sliding_Window | 336 | 92.11
| 0209 |[Minimum Size Subarray Sum](src/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 315 | 96.73

#### Day 6 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0200 |[Number of Islands](src/main/kotlin/g0101_0200/s0200_number_of_islands/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find, Big_O_Time_O(M\*N)_Space_O(M\*N) | 252 | 95.41
| 0547 |[Number of Provinces](src/main/kotlin/g0501_0600/s0547_number_of_provinces/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Union_Find, LeetCode_75_Graphs/DFS | 229 | 79.73

#### Day 7 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0117 |[Populating Next Right Pointers in Each Node II](src/main/kotlin/g0101_0200/s0117_populating_next_right_pointers_in_each_node_ii/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, Linked_List | 199 | 94.67
| 0572 |[Subtree of Another Tree](src/main/kotlin/g0501_0600/s0572_subtree_of_another_tree/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Tree, Hash_Function, String_Matching | 214 | 92.39

#### Day 8 Breadth First Search Depth First Search

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1091 |[Shortest Path in Binary Matrix](src/main/kotlin/g1001_1100/s1091_shortest_path_in_binary_matrix/Solution.kt)| Medium | Array, Breadth_First_Search, Matrix | 305 | 98.28
| 0130 |[Surrounded Regions](src/main/kotlin/g0101_0200/s0130_surrounded_regions/Solution.kt)| Medium | Top_Interview_Questions, Array, Depth_First_Search, Breadth_First_Search, Matrix, Union_Find | 355 | 84.42
| 0797 |[All Paths From Source to Target](src/main/kotlin/g0701_0800/s0797_all_paths_from_source_to_target/Solution.kt)| Medium | Depth_First_Search, Breadth_First_Search, Graph, Backtracking | 232 | 100.00

#### Day 9 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0078 |[Subsets](src/main/kotlin/g0001_0100/s0078_subsets/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Bit_Manipulation, Backtracking, Big_O_Time_O(2^n)_Space_O(n\*2^n) | 171 | 94.92
| 0090 |[Subsets II](src/main/kotlin/g0001_0100/s0090_subsets_ii/Solution.kt)| Medium | Array, Bit_Manipulation, Backtracking | 200 | 88.33

#### Day 10 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0047 |[Permutations II](src/main/kotlin/g0001_0100/s0047_permutations_ii/Solution.kt)| Medium | Array, Backtracking | 199 | 100.00
| 0039 |[Combination Sum](src/main/kotlin/g0001_0100/s0039_combination_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Backtracking, Big_O_Time_O(2^n)_Space_O(n+2^n) | 226 | 88.89
| 0040 |[Combination Sum II](src/main/kotlin/g0001_0100/s0040_combination_sum_ii/Solution.kt)| Medium | Array, Backtracking | 217 | 93.75

#### Day 11 Recursion Backtracking

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0017 |[Letter Combinations of a Phone Number](src/main/kotlin/g0001_0100/s0017_letter_combinations_of_a_phone_number/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Backtracking, LeetCode_75_Backtracking, Big_O_Time_O(4^n)_Space_O(n) | 155 | 95.24
| 0022 |[Generate Parentheses](src/main/kotlin/g0001_0100/s0022_generate_parentheses/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Backtracking, Big_O_Time_O(2^n)_Space_O(n) | 161 | 85.45
| 0079 |[Word Search](src/main/kotlin/g0001_0100/s0079_word_search/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Matrix, Backtracking, Big_O_Time_O(4^(m\*n))_Space_O(m\*n) | 392 | 72.92

#### Day 12 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0213 |[House Robber II](src/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 332 | 89.35

#### Day 13 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 208 | 93.37
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, LeetCode_75_DP/Multidimensional, Big_O_Time_O(m\*n)_Space_O(m\*n) | 118 | 94.65

#### Day 14 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 8 | 96.61
| 0413 |[Arithmetic Slices](src/main/kotlin/g0401_0500/s0413_arithmetic_slices/Solution.kt)| Medium | Array, Dynamic_Programming | 156 | 100.00

#### Day 15 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0091 |[Decode Ways](src/main/kotlin/g0001_0100/s0091_decode_ways/Solution.kt)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 148 | 79.07
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 197 | 87.17

#### Day 16 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 318 | 82.28
| 0673 |[Number of Longest Increasing Subsequence](src/main/kotlin/g0601_0700/s0673_number_of_longest_increasing_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Segment_Tree, Binary_Indexed_Tree | 226 | 91.67

#### Day 17 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n\*m)_Space_O(n\*m) | 307 | 38.36
| 0583 |[Delete Operation for Two Strings](src/main/kotlin/g0501_0600/s0583_delete_operation_for_two_strings/Solution.kt)| Medium | String, Dynamic_Programming | 197 | 100.00

#### Day 18 Dynamic Programming

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n^2)_Space_O(n2) | 182 | 92.16
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 332 | 50.68
| 0343 |[Integer Break](src/main/kotlin/g0301_0400/s0343_integer_break/Solution.kt)| Medium | Dynamic_Programming, Math | 218 | 63.89

#### Day 19 Bit Manipulation

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0201 |[Bitwise AND of Numbers Range](src/main/kotlin/g0201_0300/s0201_bitwise_and_of_numbers_range/Solution.kt)| Medium | Bit_Manipulation | 368 | 80.00

#### Day 20 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0384 |[Shuffle an Array](src/main/kotlin/g0301_0400/s0384_shuffle_an_array/Solution.kt)| Medium | Array, Math, Randomized | 940 | 72.09

#### Day 21 Others

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0202 |[Happy Number](src/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 0149 |[Max Points on a Line](src/main/kotlin/g0101_0200/s0149_max_points_on_a_line/Solution.kt)| Hard | Top_Interview_Questions, Array, Hash_Table, Math, Geometry | 307 | 83.33

### Binary Search I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0704 |[Binary Search](src/main/kotlin/g0701_0800/s0704_binary_search/Solution.kt)| Easy | Array, Binary_Search | 261 | 77.91
| 0374 |[Guess Number Higher or Lower](src/main/kotlin/g0301_0400/s0374_guess_number_higher_or_lower/Solution.kt)| Easy | Binary_Search, Interactive, LeetCode_75_Binary_Search | 134 | 94.19

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0035 |[Search Insert Position](src/main/kotlin/g0001_0100/s0035_search_insert_position/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 159 | 93.03
| 0852 |[Peak Index in a Mountain Array](src/main/kotlin/g0801_0900/s0852_peak_index_in_a_mountain_array/Solution.kt)| Medium | Array, Binary_Search | 433 | 94.29

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0367 |[Valid Perfect Square](src/main/kotlin/g0301_0400/s0367_valid_perfect_square/Solution.kt)| Easy | Math, Binary_Search | 137 | 94.55
| 1385 |[Find the Distance Value Between Two Arrays](src/main/kotlin/g1301_1400/s1385_find_the_distance_value_between_two_arrays/Solution.kt)| Easy | Array, Sorting, Binary_Search, Two_Pointers | 190 | 84.62

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0069 |[Sqrt(x)](src/main/kotlin/g0001_0100/s0069_sqrtx/Solution.kt)| Easy | Top_Interview_Questions, Math, Binary_Search | 140 | 94.72
| 0744 |[Find Smallest Letter Greater Than Target](src/main/kotlin/g0701_0800/s0744_find_smallest_letter_greater_than_target/Solution.kt)| Easy | Array, Binary_Search | 162 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0278 |[First Bad Version](src/main/kotlin/g0201_0300/s0278_first_bad_version/Solution.kt)| Easy | Binary_Search, Interactive | 349 | 76.86
| 0034 |[Find First and Last Position of Element in Sorted Array](src/main/kotlin/g0001_0100/s0034_find_first_and_last_position_of_element_in_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 174 | 100.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0441 |[Arranging Coins](src/main/kotlin/g0401_0500/s0441_arranging_coins/Solution.kt)| Easy | Math, Binary_Search | 150 | 84.21
| 1539 |[Kth Missing Positive Number](src/main/kotlin/g1501_1600/s1539_kth_missing_positive_number/Solution.kt)| Easy | Array, Binary_Search | 153 | 100.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0167 |[Two Sum II - Input Array Is Sorted](src/main/kotlin/g0101_0200/s0167_two_sum_ii_input_array_is_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers | 403 | 68.74
| 1608 |[Special Array With X Elements Greater Than or Equal X](src/main/kotlin/g1601_1700/s1608_special_array_with_x_elements_greater_than_or_equal_x/Solution.kt)| Easy | Array, Sorting, Binary_Search | 147 | 81.82

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1351 |[Count Negative Numbers in a Sorted Matrix](src/main/kotlin/g1301_1400/s1351_count_negative_numbers_in_a_sorted_matrix/Solution.kt)| Easy | Array, Binary_Search, Matrix | 206 | 71.43
| 0074 |[Search a 2D Matrix](src/main/kotlin/g0001_0100/s0074_search_a_2d_matrix/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Big_O_Time_O(endRow+endCol)_Space_O(1) | 159 | 74.46

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1337 |[The K Weakest Rows in a Matrix](src/main/kotlin/g1301_1400/s1337_the_k_weakest_rows_in_a_matrix/Solution.kt)| Easy | Array, Sorting, Binary_Search, Matrix, Heap_Priority_Queue | 216 | 77.59
| 1346 |[Check If N and Its Double Exist](src/main/kotlin/g1301_1400/s1346_check_if_n_and_its_double_exist/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 175 | 70.83

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0350 |[Intersection of Two Arrays II](src/main/kotlin/g0301_0400/s0350_intersection_of_two_arrays_ii/Solution.kt)| Easy | Array, Hash_Table, Sorting, Binary_Search, Two_Pointers | 321 | 73.37
| 0633 |[Sum of Square Numbers](src/main/kotlin/g0601_0700/s0633_sum_of_square_numbers/Solution.kt)| Medium | Math, Binary_Search, Two_Pointers | 126 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1855 |[Maximum Distance Between a Pair of Values](src/main/kotlin/g1801_1900/s1855_maximum_distance_between_a_pair_of_values/Solution.kt)| Medium | Array, Greedy, Binary_Search, Two_Pointers | 458 | 100.00
| 0033 |[Search in Rotated Sorted Array](src/main/kotlin/g0001_0100/s0033_search_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Binary_Search, Big_O_Time_O(log_n)_Space_O(1) | 151 | 93.77

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0153 |[Find Minimum in Rotated Sorted Array](src/main/kotlin/g0101_0200/s0153_find_minimum_in_rotated_sorted_array/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Big_O_Time_O(log_N)_Space_O(log_N) | 262 | 60.96

### Binary Search II

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0209 |[Minimum Size Subarray Sum](src/main/kotlin/g0201_0300/s0209_minimum_size_subarray_sum/Solution.kt)| Medium | Array, Binary_Search, Prefix_Sum, Sliding_Window | 315 | 96.73
| 0611 |[Valid Triangle Number](src/main/kotlin/g0601_0700/s0611_valid_triangle_number/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 203 | 100.00

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0658 |[Find K Closest Elements](src/main/kotlin/g0601_0700/s0658_find_k_closest_elements/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers, Heap_Priority_Queue | 375 | 95.16
| 1894 |[Find the Student that Will Replace the Chalk](src/main/kotlin/g1801_1900/s1894_find_the_student_that_will_replace_the_chalk/Solution.kt)| Medium | Array, Binary_Search, Simulation, Prefix_Sum | 520 | 50.00

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 318 | 82.28
| 1760 |[Minimum Limit of Balls in a Bag](src/main/kotlin/g1701_1800/s1760_minimum_limit_of_balls_in_a_bag/Solution.kt)| Medium | Array, Binary_Search | 460 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0875 |[Koko Eating Bananas](src/main/kotlin/g0801_0900/s0875_koko_eating_bananas/Solution.kt)| Medium | Array, Binary_Search, LeetCode_75_Binary_Search | 267 | 93.85
| 1552 |[Magnetic Force Between Two Balls](src/main/kotlin/g1501_1600/s1552_magnetic_force_between_two_balls/Solution.kt)| Medium | Array, Sorting, Binary_Search | 636 | 100.00

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0287 |[Find the Duplicate Number](src/main/kotlin/g0201_0300/s0287_find_the_duplicate_number/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Two_Pointers, Bit_Manipulation, Big_O_Time_O(n)_Space_O(n) | 656 | 66.21
| 1283 |[Find the Smallest Divisor Given a Threshold](src/main/kotlin/g1201_1300/s1283_find_the_smallest_divisor_given_a_threshold/Solution.kt)| Medium | Array, Binary_Search | 255 | 100.00

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1898 |[Maximum Number of Removable Characters](src/main/kotlin/g1801_1900/s1898_maximum_number_of_removable_characters/Solution.kt)| Medium | Array, String, Binary_Search | 636 | 100.00
| 1870 |[Minimum Speed to Arrive on Time](src/main/kotlin/g1801_1900/s1870_minimum_speed_to_arrive_on_time/Solution.kt)| Medium | Array, Binary_Search | 628 | 50.00

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1482 |[Minimum Number of Days to Make m Bouquets](src/main/kotlin/g1401_1500/s1482_minimum_number_of_days_to_make_m_bouquets/Solution.kt)| Medium | Array, Binary_Search | 538 | 50.00
| 1818 |[Minimum Absolute Sum Difference](src/main/kotlin/g1801_1900/s1818_minimum_absolute_sum_difference/Solution.kt)| Medium | Array, Sorting, Binary_Search, Ordered_Set | 447 | 100.00

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0240 |[Search a 2D Matrix II](src/main/kotlin/g0201_0300/s0240_search_a_2d_matrix_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Binary_Search, Matrix, Divide_and_Conquer, Big_O_Time_O(n+m)_Space_O(1) | 460 | 66.08
| 0275 |[H-Index II](src/main/kotlin/g0201_0300/s0275_h_index_ii/Solution.kt)| Medium | Array, Binary_Search | 398 | 81.82

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1838 |[Frequency of the Most Frequent Element](src/main/kotlin/g1801_1900/s1838_frequency_of_the_most_frequent_element/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Prefix_Sum, Sliding_Window | 564 | 88.89
| 0540 |[Single Element in a Sorted Array](src/main/kotlin/g0501_0600/s0540_single_element_in_a_sorted_array/Solution.kt)| Medium | Array, Binary_Search | 274 | 86.67

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0222 |[Count Complete Tree Nodes](src/main/kotlin/g0201_0300/s0222_count_complete_tree_nodes/Solution.kt)| Easy | Depth_First_Search, Tree, Binary_Search, Binary_Tree | 0 | 100.00
| 1712 |[Ways to Split Array Into Three Subarrays](src/main/kotlin/g1701_1800/s1712_ways_to_split_array_into_three_subarrays/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Prefix_Sum | 486 | 100.00

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0826 |[Most Profit Assigning Work](src/main/kotlin/g0801_0900/s0826_most_profit_assigning_work/Solution.kt)| Medium | Array, Sorting, Greedy, Binary_Search, Two_Pointers | 366 | 100.00
| 0436 |[Find Right Interval](src/main/kotlin/g0401_0500/s0436_find_right_interval/Solution.kt)| Medium | Array, Sorting, Binary_Search | 333 | 100.00

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0081 |[Search in Rotated Sorted Array II](src/main/kotlin/g0001_0100/s0081_search_in_rotated_sorted_array_ii/Solution.kt)| Medium | Array, Binary_Search | 170 | 96.30
| 0162 |[Find Peak Element](src/main/kotlin/g0101_0200/s0162_find_peak_element/Solution.kt)| Medium | Top_Interview_Questions, Array, Binary_Search, LeetCode_75_Binary_Search | 297 | 53.85

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0154 |[Find Minimum in Rotated Sorted Array II](src/main/kotlin/g0101_0200/s0154_find_minimum_in_rotated_sorted_array_ii/Solution.kt)| Hard | Array, Binary_Search | 275 | 84.00
| 0528 |[Random Pick with Weight](src/main/kotlin/g0501_0600/s0528_random_pick_with_weight/Solution.kt)| Medium | Math, Binary_Search, Prefix_Sum, Randomized | 393 | 91.38

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1508 |[Range Sum of Sorted Subarray Sums](src/main/kotlin/g1501_1600/s1508_range_sum_of_sorted_subarray_sums/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 378 | 66.67
| 1574 |[Shortest Subarray to be Removed to Make Array Sorted](src/main/kotlin/g1501_1600/s1574_shortest_subarray_to_be_removed_to_make_array_sorted/Solution.kt)| Medium | Array, Binary_Search, Two_Pointers, Stack, Monotonic_Stack | 477 | 50.00

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1292 |[Maximum Side Length of a Square with Sum Less than or Equal to Threshold](src/main/kotlin/g1201_1300/s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold/Solution.kt)| Medium | Array, Binary_Search, Matrix, Prefix_Sum | 376 | 100.00
| 1498 |[Number of Subsequences That Satisfy the Given Sum Condition](src/main/kotlin/g1401_1500/s1498_number_of_subsequences_that_satisfy_the_given_sum_condition/Solution.kt)| Medium | Array, Sorting, Binary_Search, Two_Pointers | 487 | 97.89

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0981 |[Time Based Key-Value Store](src/main/kotlin/g0901_1000/s0981_time_based_key_value_store/TimeMap.kt)| Medium | String, Hash_Table, Binary_Search, Design | 1011 | 65.56
| 1300 |[Sum of Mutated Array Closest to Target](src/main/kotlin/g1201_1300/s1300_sum_of_mutated_array_closest_to_target/Solution.kt)| Medium | Array, Sorting, Binary_Search | 217 | 100.00

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1802 |[Maximum Value at a Given Index in a Bounded Array](src/main/kotlin/g1801_1900/s1802_maximum_value_at_a_given_index_in_a_bounded_array/Solution.kt)| Medium | Greedy, Binary_Search | 118 | 100.00
| 1901 |[Find a Peak Element II](src/main/kotlin/g1901_2000/s1901_find_a_peak_element_ii/Solution.kt)| Medium | Array, Binary_Search, Matrix, Divide_and_Conquer | 726 | 100.00

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1146 |[Snapshot Array](src/main/kotlin/g1101_1200/s1146_snapshot_array/SnapshotArray.kt)| Medium | Array, Hash_Table, Binary_Search, Design | 1064 | 57.14
| 1488 |[Avoid Flood in The City](src/main/kotlin/g1401_1500/s1488_avoid_flood_in_the_city/Solution.kt)| Medium | Array, Hash_Table, Greedy, Binary_Search, Heap_Priority_Queue | 823 | 66.67

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1562 |[Find Latest Group of Size M](src/main/kotlin/g1501_1600/s1562_find_latest_group_of_size_m/Solution.kt)| Medium | Array, Binary_Search, Simulation | 534 | 100.00
| 1648 |[Sell Diminishing-Valued Colored Balls](src/main/kotlin/g1601_1700/s1648_sell_diminishing_valued_colored_balls/Solution.kt)| Medium | Array, Math, Sorting, Greedy, Binary_Search, Heap_Priority_Queue | 509 | 100.00

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1201 |[Ugly Number III](src/main/kotlin/g1201_1300/s1201_ugly_number_iii/Solution.kt)| Medium | Math, Binary_Search, Number_Theory | 136 | 100.00
| 0911 |[Online Election](src/main/kotlin/g0901_1000/s0911_online_election/TopVotedCandidate.kt)| Medium | Array, Hash_Table, Binary_Search, Design | 766 | 83.33

### Dynamic Programming I

#### Day 1

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0509 |[Fibonacci Number](src/main/kotlin/g0501_0600/s0509_fibonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Recursion, Memoization | 139 | 82.72
| 1137 |[N-th Tribonacci Number](src/main/kotlin/g1101_1200/s1137_n_th_tribonacci_number/Solution.kt)| Easy | Dynamic_Programming, Math, Memoization, LeetCode_75_DP/1D | 122 | 69.35

#### Day 2

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0070 |[Climbing Stairs](src/main/kotlin/g0001_0100/s0070_climbing_stairs/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Memoization, Big_O_Time_O(n)_Space_O(n) | 124 | 71.98
| 0746 |[Min Cost Climbing Stairs](src/main/kotlin/g0701_0800/s0746_min_cost_climbing_stairs/Solution.kt)| Easy | Array, Dynamic_Programming, LeetCode_75_DP/1D | 171 | 96.76

#### Day 3

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0198 |[House Robber](src/main/kotlin/g0101_0200/s0198_house_robber/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, LeetCode_75_DP/1D, Big_O_Time_O(n)_Space_O(n) | 156 | 92.24
| 0213 |[House Robber II](src/main/kotlin/g0201_0300/s0213_house_robber_ii/Solution.kt)| Medium | Array, Dynamic_Programming | 257 | 59.62
| 0740 |[Delete and Earn](src/main/kotlin/g0701_0800/s0740_delete_and_earn/Solution.kt)| Medium | Array, Hash_Table, Dynamic_Programming | 192 | 100.00

#### Day 4

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0055 |[Jump Game](src/main/kotlin/g0001_0100/s0055_jump_game/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 332 | 89.35
| 0045 |[Jump Game II](src/main/kotlin/g0001_0100/s0045_jump_game_ii/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Greedy, Big_O_Time_O(n)_Space_O(1) | 208 | 93.37

#### Day 5

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0053 |[Maximum Subarray](src/main/kotlin/g0001_0100/s0053_maximum_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Divide_and_Conquer, Big_O_Time_O(n)_Space_O(1) | 510 | 78.81
| 0918 |[Maximum Sum Circular Subarray](src/main/kotlin/g0901_1000/s0918_maximum_sum_circular_subarray/Solution.kt)| Medium | Array, Dynamic_Programming, Divide_and_Conquer, Queue, Monotonic_Queue | 339 | 86.96

#### Day 6

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0152 |[Maximum Product Subarray](src/main/kotlin/g0101_0200/s0152_maximum_product_subarray/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 253 | 88.42
| 1567 |[Maximum Length of Subarray With Positive Product](src/main/kotlin/g1501_1600/s1567_maximum_length_of_subarray_with_positive_product/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 468 | 33.33

#### Day 7

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1014 |[Best Sightseeing Pair](src/main/kotlin/g1001_1100/s1014_best_sightseeing_pair/Solution.kt)| Medium | Array, Dynamic_Programming | 336 | 66.67
| 0121 |[Best Time to Buy and Sell Stock](src/main/kotlin/g0101_0200/s0121_best_time_to_buy_and_sell_stock/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Big_O_Time_O(N)_Space_O(1) | 609 | 94.06
| 0122 |[Best Time to Buy and Sell Stock II](src/main/kotlin/g0101_0200/s0122_best_time_to_buy_and_sell_stock_ii/Solution.kt)| Medium | Top_Interview_Questions, Array, Dynamic_Programming, Greedy | 197 | 95.10

#### Day 8

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0309 |[Best Time to Buy and Sell Stock with Cooldown](src/main/kotlin/g0301_0400/s0309_best_time_to_buy_and_sell_stock_with_cooldown/Solution.kt)| Medium | Array, Dynamic_Programming | 272 | 73.33
| 0714 |[Best Time to Buy and Sell Stock with Transaction Fee](src/main/kotlin/g0701_0800/s0714_best_time_to_buy_and_sell_stock_with_transaction_fee/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy, LeetCode_75_DP/Multidimensional | 417 | 90.91

#### Day 9

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0139 |[Word Break](src/main/kotlin/g0101_0200/s0139_word_break/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Hash_Table, Dynamic_Programming, Trie, Memoization, Big_O_Time_O(M+max\*N)_Space_O(M+N+max) | 197 | 87.17
| 0042 |[Trapping Rain Water](src/main/kotlin/g0001_0100/s0042_trapping_rain_water/Solution.kt)| Hard | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming, Two_Pointers, Stack, Monotonic_Stack, Big_O_Time_O(n)_Space_O(1) | 189 | 99.37

#### Day 10

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0413 |[Arithmetic Slices](src/main/kotlin/g0401_0500/s0413_arithmetic_slices/Solution.kt)| Medium | Array, Dynamic_Programming | 156 | 100.00
| 0091 |[Decode Ways](src/main/kotlin/g0001_0100/s0091_decode_ways/Solution.kt)| Medium | Top_Interview_Questions, String, Dynamic_Programming | 148 | 79.07

#### Day 11

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0264 |[Ugly Number II](src/main/kotlin/g0201_0300/s0264_ugly_number_ii/Solution.kt)| Medium | Hash_Table, Dynamic_Programming, Math, Heap_Priority_Queue | 182 | 95.45
| 0096 |[Unique Binary Search Trees](src/main/kotlin/g0001_0100/s0096_unique_binary_search_trees/Solution.kt)| Medium | Dynamic_Programming, Math, Tree, Binary_Tree, Binary_Search_Tree, Big_O_Time_O(n)_Space_O(1) | 116 | 92.31

#### Day 12

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0118 |[Pascal's Triangle](src/main/kotlin/g0101_0200/s0118_pascals_triangle/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Array, Dynamic_Programming | 277 | 33.22
| 0119 |[Pascal's Triangle II](src/main/kotlin/g0101_0200/s0119_pascals_triangle_ii/Solution.kt)| Easy | Array, Dynamic_Programming | 157 | 97.27

#### Day 13

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0931 |[Minimum Falling Path Sum](src/main/kotlin/g0901_1000/s0931_minimum_falling_path_sum/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 201 | 84.21
| 0120 |[Triangle](src/main/kotlin/g0101_0200/s0120_triangle/Solution.kt)| Medium | Array, Dynamic_Programming | 194 | 97.87

#### Day 14

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1314 |[Matrix Block Sum](src/main/kotlin/g1301_1400/s1314_matrix_block_sum/Solution.kt)| Medium | Array, Matrix, Prefix_Sum | 235 | 100.00
| 0304 |[Range Sum Query 2D - Immutable](src/main/kotlin/g0301_0400/s0304_range_sum_query_2d_immutable/NumMatrix.kt)| Medium | Array, Matrix, Design, Prefix_Sum | 1373 | 85.71

#### Day 15

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0062 |[Unique Paths](src/main/kotlin/g0001_0100/s0062_unique_paths/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, Dynamic_Programming, Math, Combinatorics, LeetCode_75_DP/Multidimensional, Big_O_Time_O(m\*n)_Space_O(m\*n) | 118 | 94.65
| 0063 |[Unique Paths II](src/main/kotlin/g0001_0100/s0063_unique_paths_ii/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix | 151 | 81.94

#### Day 16

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0064 |[Minimum Path Sum](src/main/kotlin/g0001_0100/s0064_minimum_path_sum/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 164 | 100.00
| 0221 |[Maximal Square](src/main/kotlin/g0201_0300/s0221_maximal_square/Solution.kt)| Medium | Array, Dynamic_Programming, Matrix, Big_O_Time_O(m\*n)_Space_O(m\*n) | 614 | 44.00

#### Day 17

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0005 |[Longest Palindromic Substring](src/main/kotlin/g0001_0100/s0005_longest_palindromic_substring/Solution.kt)| Medium | Top_100_Liked_Questions, Top_Interview_Questions, String, Dynamic_Programming, Big_O_Time_O(n)_Space_O(n) | 8 | 96.61
| 0516 |[Longest Palindromic Subsequence](src/main/kotlin/g0501_0600/s0516_longest_palindromic_subsequence/Solution.kt)| Medium | String, Dynamic_Programming | 243 | 87.50

#### Day 18

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0300 |[Longest Increasing Subsequence](src/main/kotlin/g0201_0300/s0300_longest_increasing_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Binary_Search, Big_O_Time_O(n\*log_n)_Space_O(n) | 318 | 82.28
| 0376 |[Wiggle Subsequence](src/main/kotlin/g0301_0400/s0376_wiggle_subsequence/Solution.kt)| Medium | Array, Dynamic_Programming, Greedy | 162 | 88.89

#### Day 19

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0392 |[Is Subsequence](src/main/kotlin/g0301_0400/s0392_is_subsequence/Solution.kt)| Easy | String, Dynamic_Programming, Two_Pointers, LeetCode_75_Two_Pointers | 156 | 87.74
| 1143 |[Longest Common Subsequence](src/main/kotlin/g1101_1200/s1143_longest_common_subsequence/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n\*m)_Space_O(n\*m) | 307 | 38.36
| 0072 |[Edit Distance](src/main/kotlin/g0001_0100/s0072_edit_distance/Solution.kt)| Medium | Top_100_Liked_Questions, String, Dynamic_Programming, LeetCode_75_DP/Multidimensional, Big_O_Time_O(n^2)_Space_O(n2) | 182 | 92.16

#### Day 20

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0322 |[Coin Change](src/main/kotlin/g0301_0400/s0322_coin_change/Solution.kt)| Medium | Top_100_Liked_Questions, Array, Dynamic_Programming, Breadth_First_Search, Big_O_Time_O(m\*n)_Space_O(amount) | 332 | 50.68
| 0518 |[Coin Change II](src/main/kotlin/g0501_0600/s0518_coin_change_2/Solution.kt)| Medium | Array, Dynamic_Programming | 139 | 100.00

#### Day 21

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0377 |[Combination Sum IV](src/main/kotlin/g0301_0400/s0377_combination_sum_iv/Solution.kt)| Medium | Array, Dynamic_Programming | 217 | 72.41
| 0343 |[Integer Break](src/main/kotlin/g0301_0400/s0343_integer_break/Solution.kt)| Medium | Dynamic_Programming, Math | 218 | 63.89
| 0279 |[Perfect Squares](src/main/kotlin/g0201_0300/s0279_perfect_squares/Solution.kt)| Medium | Top_100_Liked_Questions, Dynamic_Programming, Math, Breadth_First_Search | 176 | 98.80

### Programming Skills I

#### Day 1 Basic Data Type

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1523 |[Count Odd Numbers in an Interval Range](src/main/kotlin/g1501_1600/s1523_count_odd_numbers_in_an_interval_range/Solution.kt)| Easy | Math | 114 | 97.22
| 1491 |[Average Salary Excluding the Minimum and Maximum Salary](src/main/kotlin/g1401_1500/s1491_average_salary_excluding_the_minimum_and_maximum_salary/Solution.kt)| Easy | Array, Sorting | 137 | 91.67

#### Day 2 Operator

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0191 |[Number of 1 Bits](src/main/kotlin/g0101_0200/s0191_number_of_1_bits/Solution.kt)| Easy | Top_Interview_Questions, Bit_Manipulation | 237 | 68.44
| 1281 |[Subtract the Product and Sum of Digits of an Integer](src/main/kotlin/g1201_1300/s1281_subtract_the_product_and_sum_of_digits_of_an_integer/Solution.kt)| Easy | Math | 128 | 61.82

#### Day 3 Conditional Statements

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0976 |[Largest Perimeter Triangle](src/main/kotlin/g0901_1000/s0976_largest_perimeter_triangle/Solution.kt)| Easy | Array, Math, Sorting, Greedy | 304 | 33.33
| 1779 |[Find Nearest Point That Has the Same X or Y Coordinate](src/main/kotlin/g1701_1800/s1779_find_nearest_point_that_has_the_same_x_or_y_coordinate/Solution.kt)| Easy | Array | 364 | 100.00

#### Day 4 Loop

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1822 |[Sign of the Product of an Array](src/main/kotlin/g1801_1900/s1822_sign_of_the_product_of_an_array/Solution.kt)| Easy | Array, Math | 170 | 92.51
| 1502 |[Can Make Arithmetic Progression From Sequence](src/main/kotlin/g1501_1600/s1502_can_make_arithmetic_progression_from_sequence/Solution.kt)| Easy | Array, Sorting | 156 | 94.82
| 0202 |[Happy Number](src/main/kotlin/g0201_0300/s0202_happy_number/Solution.kt)| Easy | Top_Interview_Questions, Hash_Table, Math, Two_Pointers | 261 | 45.08
| 1790 |[Check if One String Swap Can Make Strings Equal](src/main/kotlin/g1701_1800/s1790_check_if_one_string_swap_can_make_strings_equal/Solution.kt)| Easy | String, Hash_Table, Counting | 138 | 100.00

#### Day 5 Function

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0589 |[N-ary Tree Preorder Traversal](src/main/kotlin/g0501_0600/s0589_n_ary_tree_preorder_traversal/Solution.kt)| Easy | Depth_First_Search, Tree, Stack | 233 | 84.02
| 0496 |[Next Greater Element I](src/main/kotlin/g0401_0500/s0496_next_greater_element_i/Solution.kt)| Easy | Array, Hash_Table, Stack, Monotonic_Stack | 171 | 100.00
| 1232 |[Check If It Is a Straight Line](src/main/kotlin/g1201_1300/s1232_check_if_it_is_a_straight_line/Solution.kt)| Easy | Array, Math, Geometry | 152 | 95.38

#### Day 6 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1588 |[Sum of All Odd Length Subarrays](src/main/kotlin/g1501_1600/s1588_sum_of_all_odd_length_subarrays/Solution.kt)| Easy | Array, Math, Prefix_Sum | 157 | 64.00
| 0283 |[Move Zeroes](src/main/kotlin/g0201_0300/s0283_move_zeroes/Solution.kt)| Easy | Top_100_Liked_Questions, Array, Two_Pointers, LeetCode_75_Two_Pointers, Big_O_Time_O(n)_Space_O(1) | 516 | 79.07
| 1672 |[Richest Customer Wealth](src/main/kotlin/g1601_1700/s1672_richest_customer_wealth/Solution.kt)| Easy | Array, Matrix | 155 | 94.54

#### Day 7 Array

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1572 |[Matrix Diagonal Sum](src/main/kotlin/g1501_1600/s1572_matrix_diagonal_sum/Solution.kt)| Easy | Array, Matrix | 221 | 67.61
| 0566 |[Reshape the Matrix](src/main/kotlin/g0501_0600/s0566_reshape_the_matrix/Solution.kt)| Easy | Array, Matrix, Simulation | 239 | 99.05

#### Day 8 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1768 |[Merge Strings Alternately](src/main/kotlin/g1701_1800/s1768_merge_strings_alternately/Solution.kt)| Easy | String, Two_Pointers, LeetCode_75_Array/String | 138 | 93.81
| 1678 |[Goal Parser Interpretation](src/main/kotlin/g1601_1700/s1678_goal_parser_interpretation/Solution.kt)| Easy | String | 136 | 88.24
| 0389 |[Find the Difference](src/main/kotlin/g0301_0400/s0389_find_the_difference/Solution.kt)| Easy | String, Hash_Table, Sorting, Bit_Manipulation | 256 | 64.81

#### Day 9 String

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 0709 |[To Lower Case](src/main/kotlin/g0701_0800/s0709_to_lower_case/Solution.kt)| Easy | String | 142 | 98.68
| 1309 |[Decrypt String from Alphabet to Integer Mapping](src/main/kotlin/g1301_1400/s1309_decrypt_string_from_alphabet_to_integer_mapping/Solution.kt)| Easy | String | 0 | 100.00
| 0953 |[Verifying an Alien Dictionary](src/main/kotlin/g0901_1000/s0953_verifying_an_alien_dictionary/Solution.kt)| Easy | Array, String, Hash_Table | 137 | 100.00

#### Day 10 Linked List and Tree

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1290 |[Convert Binary Number in a Linked List to Integer](src/main/kotlin/g1201_1300/s1290_convert_binary_number_in_a_linked_list_to_integer/Solution.kt)| Easy | Math, Linked_List | 138 | 65.79
| 0876 |[Middle of the Linked List](src/main/kotlin/g0801_0900/s0876_middle_of_the_linked_list/Solution.kt)| Easy | Two_Pointers, Linked_List | 136 | 76.52
| 0104 |[Maximum Depth of Binary Tree](src/main/kotlin/g0101_0200/s0104_maximum_depth_of_binary_tree/Solution.kt)| Easy | Top_100_Liked_Questions, Top_Interview_Questions, Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree, LeetCode_75_Binary_Tree/DFS, Big_O_Time_O(N)_Space_O(H) | 166 | 83.53
| 0404 |[Sum of Left Leaves](src/main/kotlin/g0401_0500/s0404_sum_of_left_leaves/Solution.kt)| Easy | Depth_First_Search, Breadth_First_Search, Tree, Binary_Tree | 173 | 86.05

#### Day 11 Containers and Libraries

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1356 |[Sort Integers by The Number of 1 Bits](src/main/kotlin/g1301_1400/s1356_sort_integers_by_the_number_of_1_bits/Solution.kt)| Easy | Array, Sorting, Bit_Manipulation, Counting | 236 | 92.31
| 0232 |[Implement Queue using Stacks](src/main/kotlin/g0201_0300/s0232_implement_queue_using_stacks/MyQueue.kt)| Easy | Stack, Design, Queue | 258 | 70.86
| 0242 |[Valid Anagram](src/main/kotlin/g0201_0300/s0242_valid_anagram/Solution.kt)| Easy | String, Hash_Table, Sorting | 251 | 87.65
| 0217 |[Contains Duplicate](src/main/kotlin/g0201_0300/s0217_contains_duplicate/Solution.kt)| Easy | Top_Interview_Questions, Array, Hash_Table, Sorting | 719 | 73.49

#### Day 12 Class and Object

| <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- --> | <!-- -->
|-|-|-|-|-|-
| 1603 |[Design Parking System](src/main/kotlin/g1601_1700/s1603_design_parking_system/ParkingSystem.kt)| Easy | Design, Simulation, Counting | 376 | 31.83
| 0303 |[Range Sum Query - Immutable](src/main/kotlin/g0301_0400/s0303_range_sum_query_immutable/NumArray.kt)| Easy | Array, Design, Prefix_Sum | 472 | 63.64

## Contributing
Your ideas/fixes/algorithms are more than welcome!

1. Fork this repo
2. Clone your forked repo (`git clone https://github.com/YOUR_GITHUB_USERNAME/LeetCode-in-Kotlin.git`) onto your local machine
3. `cd` into your cloned directory, create your feature branch (`git checkout -b my-awesome-fix`)
4. `git add` your desired changes to this repo
5. Commit your changes (`git commit -m 'Added some awesome features/fixes'`)
6. Push to the branch (`git push origin my-awesome-feature`)
7. Open your forked repo on Github website, create a new Pull Request to this repo!
