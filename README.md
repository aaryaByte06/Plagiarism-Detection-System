# Plagiarism Detection System (DS II Project)

## Overview
This project implements a plagiarism detection system using n-gram analysis and hashing techniques. It compares documents and calculates similarity percentages based on shared text patterns.
It is an IDE-independent project, and any IDE which can run java can be used.

---

## Objectives
- Detect similarity between documents
- Implement efficient text comparison using data structures
- Apply hashing and n-gram techniques
- Build a scalable base for real-world plagiarism detection systems

---

## Concepts Used
- Tokenization
- N-grams (n = 3)
- Hash-based comparison
- Set intersection
- Similarity calculation

---

## Data Structures Used
- ArrayList → storing tokens and n-grams  
- HashMap → storing document mappings  
- HashSet → efficient comparison  
- StringBuilder → building n-grams  

---

## How It Works

1. Read input text files  
2. Preprocess text (lowercase, remove punctuation)  
3. Tokenize into words  
4. Generate n-grams  
5. Compare n-grams using sets  
6. Calculate similarity percentage  

---

## Input Options

The system supports two modes:

1. **Manual Input Mode**  
   - User enters file paths at runtime  
   - Supports both absolute paths and relative paths  

2. **Sample Dataset Mode**  
   - Sample text files are included in the `data/` folder  
   - Users can input paths like:
     ```
     data/doc1.txt
     data/doc2.txt
     data/doc3.txt
     ```
   - The above paths are already present in the mentioned folder
---

## How to Run

1. Clone the repository:
```
git clone https://github.com/YOUR_USERNAME/Plagiarism-Detection-System-DSII.git
```

2. Open the project in any Java IDE:
- IntelliJ IDEA
- Eclipse
- NetBeans

3. Run `Main.java`

4. Enter file paths when prompted  
   (Example: `data/doc1.txt`)

---

## Sample Output

```
doc1 vs doc2 → 50.00%
doc1 vs doc3 → 0.00%
doc2 vs doc3 → 0.00%
```

---

## Future Enhancements
- GUI interface (JavaFX)
- File upload system
- Database integration (MySQL)
- Advanced hashing (Rabin-Karp)
- Highlight matching text
- Integration with large datasets

---

## Team Members
- Aarya Deodhar  
- Raghavendra Rao
- Maithilee Kate
- Avanish Parkhi

---

## Conclusion
This project demonstrates how fundamental data structures can be used to build efficient real-world systems like plagiarism detection tools.

---
