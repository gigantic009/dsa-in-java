import java.util.Arrays;
import java.util.List;

public class MatrixAlgorithmsTest {
    private static int checks = 0;

    public static void main(String[] args) {
        testRotateMatrix();
        testSearchMatrix();
        testSetMatrixZeroes();
        testSpiralMatrix();
        testTransposeMatrix();

        System.out.println("Passed " + checks + " matrix algorithm checks.");
    }

    private static void testRotateMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        RotateMatrix90.rotate(matrix);
        assertMatrixEquals(new int[][]{
            {7, 4, 1},
            {8, 5, 2},
            {9, 6, 3}
        }, matrix, "3x3 clockwise rotation");

        int[][] single = {{5}};
        RotateMatrix90.rotate(single);
        assertMatrixEquals(new int[][]{{5}}, single, "1x1 rotation");
    }

    private static void testSearchMatrix() {
        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        assertBooleanEquals(true, SearchMatrix.searchMatrix(matrix, 3), "find first-row target");
        assertBooleanEquals(true, SearchMatrix.searchMatrix(matrix, 60), "find last target");
        assertBooleanEquals(false, SearchMatrix.searchMatrix(matrix, 13), "missing target");
        assertBooleanEquals(true, SearchMatrix.searchMatrix(new int[][]{{8}}, 8), "1x1 hit");
        assertBooleanEquals(false, SearchMatrix.searchMatrix(new int[][]{{8}}, 2), "1x1 miss");
        assertBooleanEquals(false, SearchMatrix.searchMatrix(new int[0][0], 1), "empty matrix");
        assertBooleanEquals(false, SearchMatrix.searchMatrix(null, 1), "null matrix");
    }

    private static void testSetMatrixZeroes() {
        int[][] interiorZero = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        SetMatrixZeroes.setZeroes(interiorZero);
        assertMatrixEquals(new int[][]{
            {1, 0, 1},
            {0, 0, 0},
            {1, 0, 1}
        }, interiorZero, "interior zero");

        int[][] firstRowZero = {
            {0, 1, 2},
            {3, 4, 5}
        };
        SetMatrixZeroes.setZeroes(firstRowZero);
        assertMatrixEquals(new int[][]{
            {0, 0, 0},
            {0, 4, 5}
        }, firstRowZero, "first-row zero");

        int[][] firstColumnZero = {
            {1, 2},
            {0, 4},
            {5, 6}
        };
        SetMatrixZeroes.setZeroes(firstColumnZero);
        assertMatrixEquals(new int[][]{
            {1, 2},
            {0, 0},
            {0, 6}
        }, firstColumnZero, "first-column zero");

        int[][] single = {{0}};
        SetMatrixZeroes.setZeroes(single);
        assertMatrixEquals(new int[][]{{0}}, single, "1x1 zero");
        SetMatrixZeroes.setZeroes(null);
        SetMatrixZeroes.setZeroes(new int[0][0]);
        checks += 2;
    }

    private static void testSpiralMatrix() {
        int[][] square = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        assertListEquals(List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                SpiralMatrix.spiral(square), "3x3 spiral");

        int[][] rectangular = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        assertListEquals(List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                SpiralMatrix.spiral(rectangular), "3x4 spiral");

        assertListEquals(List.of(1, 2, 3, 4),
                SpiralMatrix.spiral(new int[][]{{1, 2, 3, 4}}), "single row");
        assertListEquals(List.of(1, 2, 3),
                SpiralMatrix.spiral(new int[][]{{1}, {2}, {3}}), "single column");
        assertListEquals(List.of(5),
                SpiralMatrix.spiral(new int[][]{{5}}), "1x1 spiral");
        assertListEquals(List.of(), SpiralMatrix.spiral(null), "null matrix");
        assertListEquals(List.of(), SpiralMatrix.spiral(new int[0][0]), "empty matrix");
    }

    private static void testTransposeMatrix() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        assertMatrixEquals(new int[][]{
            {1, 4},
            {2, 5},
            {3, 6}
        }, TransposeMatrix.transpose(matrix), "2x3 transpose");

        assertMatrixEquals(new int[][]{{1, 2, 3}},
                TransposeMatrix.transpose(new int[][]{{1}, {2}, {3}}),
                "3x1 transpose");
        assertMatrixEquals(new int[][]{{5}},
                TransposeMatrix.transpose(new int[][]{{5}}), "1x1 transpose");
        assertMatrixEquals(new int[0][0],
                TransposeMatrix.transpose(new int[0][0]), "empty transpose");
        assertMatrixEquals(new int[0][0],
                TransposeMatrix.transpose(null), "null transpose");
    }

    private static void assertMatrixEquals(int[][] expected, int[][] actual, String description) {
        if (!Arrays.deepEquals(expected, actual)) {
            throw new AssertionError(description + ": expected "
                    + Arrays.deepToString(expected) + ", got " + Arrays.deepToString(actual));
        }
        checks++;
    }

    private static void assertBooleanEquals(boolean expected, boolean actual, String description) {
        if (expected != actual) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }

    private static void assertListEquals(List<Integer> expected, List<Integer> actual, String description) {
        if (!expected.equals(actual)) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }
}
