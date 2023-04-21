package org.mycompany.springboot.app;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mycompany.springboot.app.models.Banco;
import org.mycompany.springboot.app.models.Cuenta;
import org.mycompany.springboot.app.services.CuentaService;
import org.mycompany.springboot.app.exceptions.DineroInsuficienteException;
import org.mycompany.springboot.app.repositories.BancoRepository;
import org.mycompany.springboot.app.repositories.CuentaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


class SpringbootTestApplicationTests {
}
