package models.inventory;

import java.io.Serializable;
import java.util.Calendar;

public class prestamo implements Serializable {
  private Integer ISBN; // ISBN del libro a prestar
  private Integer UID; // ID del usuario al que se realiza el prestamo
  private Calendar fechaInicio;
  private Calendar fechaEntrega;

}
