package com.ingjuanfg.stepdefinitions;


import com.ingjuanfg.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AddToCartSaucedemoStepDefinition {



    @Steps
    LoginStep loginStep;

    @Steps
    AddToCartStep addToCartStep;

    @Steps
    CartCheckoutStep cartCheckoutStep;

    @Steps
    CheckoutStep checkoutStep;

    @Steps
    CheckoutCompleteStep checkoutCompleteStep;



    @Dado("que el usuario ya esta logueado")
    public void queElUsuarioYaEstaLogueado(Map<String, String> credenciales) {
        loginStep.openNavigator();
        loginStep.authentication(credenciales);
    }

    @Cuando("el usuario agrega producto al carrito")
    public void elUsuarioAgregaProductoAlCarrito() {
        addToCartStep.agregarProductoCarrito();
        addToCartStep.verificarProductoAgregado();
    }

    @Cuando("realiza el checkout de la compra")
    public void realizaElCheckoutDeLaCompra(List<Map<String, String>> datosCheckOut) throws Exception{
        cartCheckoutStep.clickBotonCheckout();
        checkoutStep.completarFormularioCheckout(datosCheckOut);
        //Thread.sleep(10000);
    }

    @Entonces("el usuario realiza una compra exitosa")
    public void elUsuarioRealizaUnaCompraExitosa()  {
        assertThat(true, is(checkoutCompleteStep.obtenerMensajeCheckout()));
    }
}
