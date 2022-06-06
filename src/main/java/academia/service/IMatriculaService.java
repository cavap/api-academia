package academia.service;

import academia.entity.Matricula;
import academia.entity.form.MatriculaForm;
import java.util.List;

public interface IMatriculaService {
  Matricula create(MatriculaForm form);
  Matricula get(Long id);
  List<Matricula> getAll(String bairro);
  void delete(Long id);
}
