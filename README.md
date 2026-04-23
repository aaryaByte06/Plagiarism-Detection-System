# Plagiarism Detection System (DS II Project)

##  Overview
This project implements a plagiarism detection system using n-gram analysis and hashing techniques. It compares multiple documents and calculates similarity percentages based on shared text patterns.
It is IDE-independent and can be executed in any Java-supported development environment.
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
- ArrayList: storing tokens and n-grams  
- HashMap: storing document mappings  
- HashSet: efficient comparison  
- StringBuilder: building n-grams  

---

## How It Works

1. Read input text files  
2. Preprocess text (lowercase, remove punctuation)  
3. Tokenize into words  
4. Generate n-grams  
5. Compare n-grams using sets  
6. Calculate similarity percentage  

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

3. Ensure file paths are correctly set in Main.java

4. Run `Main.java`

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
