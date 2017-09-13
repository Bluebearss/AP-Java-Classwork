import java.util.List;
import java.util.ArrayList;

public class SparseArray
{
	 /** The number of rows and columns in the sparse array. */
	 private int numRows;
	 private int numCols;
	 
	 /** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
	* list in no particular order. Each non-zero element is represented by exactly one entry in the list.
	 */
	 private List<SparseArrayEntry> entries;
	 
	 /** Constructs an empty SparseArray. */
	 public SparseArray()
	 { 
	 	entries = new ArrayList<SparseArrayEntry>(); 
	 }
	 
	 /** Returns the number of rows in the sparse array. */
	 public int getNumRows()
	 { 
	 		return numRows; 
	 }
	 
	 /** Returns the number of columns in the sparse array. */
	 public int getNumCols()
	 { 
	 	return numCols; 
	 }
	 
	 /** Returns the value of the element at row index row and column index col in the sparse array.
	* Precondition: 0  row < getNumRows()
	 * 0  col < getNumCols()
	 */
	 public int getValueAt(int row, int col)
	 { 
	 	for (SparseArrayEntry s : entries)
		{
		 if (s.getRow() == row && s.getCol() == col)
		 {
		  return s.getValue();
		 }
		}
			  
		return 0;
	 }
	 
	 /** Removes the column col from the sparse array.
	* Precondition: 0 <= col < getNumCols()
	 */
	 public void removeColumn(int col)
	 { 
		int index = 0;
		while (index < entries.size())
		{
		  SparseArrayEntry s = entries.get(index);
		  if (s.getCol() == col)
		  {
		    entries.remove(index);
		  }
		  else
		  {
		    if (s.getCol() > col)
		    {
		      entries.set(index, new SparseArrayEntry(s.getRow(), s.getCol() - 1, s.getValue()));
		      index++;
		    }
		    else
		    {
		      index++;
		    }
		  }
		}
		
		numCols--;
	 }
	 
	 // There may be instance variables, constructors, and methods that are not shown.
} 