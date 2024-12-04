package test.steps;

import com.exception.NoSquareException;
import com.model.Matrix;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import static com.service.MatrixMathematics.determinant;
import static org.junit.Assert.assertEquals;

public class CalculDeterminantSteps {
    private Matrix matrice;
    private double determinant;

    @Given("une matrice 3x3 avec les valeurs suivantes")
    public void une_matrice_3x3_avec_les_valeurs_suivantes(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        double[][] matrixData = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixData[i][j] = Double.parseDouble(data.get(i).get(j));
            }
        }
        matrice = new Matrix(matrixData);
    }

    @When("je calcule le déterminant")
    public void je_calcule_le_determinant() throws NoSquareException {
        determinant = determinant(matrice);
    }

    @Then("le déterminant devrait être {double}")
    public void le_determinant_devrait_etre(double expectedResult) {
        assertEquals(expectedResult, determinant, 0.0001);
    }

}
