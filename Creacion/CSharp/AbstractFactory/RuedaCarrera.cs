﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractFactory
{
    public class RuedaCarrera : Rueda
    {
        public override string GetTextoRueda()
        {
            return "Soy una Rueda de Carrera!";
        }
    }
}
