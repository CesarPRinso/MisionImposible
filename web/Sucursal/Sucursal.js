$(document).ready(ini);

function ini()
{
   $('#btn_guardar').click(Guadar_Sucursal);
}
function Guadar_Sucursal() {
    
        var param = {
            id: $('#txt_id').attr('value'),
            nombre: $('#txt_nombre').attr('value'),
            direccion: $('#txt_direccion').attr('value'),
            telefono: $('#txt_telefono').attr('value'),
            operacion: 'nuevo'
        }
        $.ajax({
            url: "../SucursalServlet",
            data: param,
            type: "POST",
            beforeSend: function () {
            },
            error: function () {
                alert('error')
            },
            success: function (dat)
            {
                
                
            }
        });
   
}

