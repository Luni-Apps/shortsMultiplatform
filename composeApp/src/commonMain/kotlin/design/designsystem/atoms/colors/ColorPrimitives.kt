package design.designsystem.atoms.colors

import androidx.compose.ui.graphics.Color

internal object ColorPrimitives{

    object Primitive {

        object Brand {
            val tint10 = Color(0xFFFFE0F6)
            val tint20 = Color(0xFFFFABDF)
            val tint30 = Color(0xFFFF76BC)
            val tint40Opacity10 = Color(0xFFFF3288).copy(alpha = 0.1f)
            val tint40Opacity20 = Color(0xFFFF3288).copy(alpha = 0.2f)
            val tint40Opacity30 = Color(0xFFFF3288).copy(alpha = 0.3f)
            val tint40Opacity40 = Color(0xFFFF3288).copy(alpha = 0.4f)
            val tint40Opacity50 = Color(0xFFFF3288).copy(alpha = 0.5f)
            val tint40Opacity60 = Color(0xFFFF3288).copy(alpha = 0.6f)
            val tint40Opacity70 = Color(0xFFFF3288).copy(alpha = 0.7f)
            val tint40Opacity80 = Color(0xFFFF3288).copy(alpha = 0.8f)
            val tint40Opacity90 = Color(0xFFFF3288).copy(alpha = 0.9f)
            val tint40 = Color(0xFFFF3288)
            val tint50 = Color(0xFFBF3878)
            val tint60 = Color(0xFF601E40)
            val tint70 = Color(0xFF270617)
        }

        object Neutral {
            val tint10 = Color(0xFFEDF7F7)
            val tint20 = Color(0xFFCAD8DD)
            val tint30 = Color(0xFFA8B8C3)
            val tint40 = Color(0xFF6D7A8F)
            val tint50 = Color(0xFF3D4556)
            val tint60 = Color(0xFF202531)
            val tint70 = Color(0xFF13161D)
        }

        object Yellow {
            val tint10 = Color(0xFFFDF8EE)
            val tint20 = Color(0xFFF8E1B8)
            val tint30 = Color(0xFFF5D59B)
            val tint40 = Color(0xFFF0C26F)
            val tint50 = Color(0xFFEDB652)
            val tint60 = Color(0xFFA67F39)
            val tint70 = Color(0xFF916F32)
        }

        object Brown {
            val tint10 = Color(0xFFECEBEA)
            val tint20 = Color(0xFFB0ADAA)
            val tint30 = Color(0xFF8F8C87)
            val tint40 = Color(0xFF5F5A53)
            val tint50 = Color(0xFF3E3830)
            val tint60 = Color(0xFF26221D)
            val tint70 = Color(0xFF1F1A16)
        }

        object Green {
            val opacity10 = Color(0xFF42BE65).copy(alpha = 0.1f)
            val opacity20 = Color(0xFF42BE65).copy(alpha = 0.2f)
            val opacity30 = Color(0xFF42BE65).copy(alpha = 0.3f)
            val opacity40 = Color(0xFF42BE65).copy(alpha = 0.4f)
            val opacity50 = Color(0xFF42BE65).copy(alpha = 0.5f)
            val opacity60 = Color(0xFF42BE65).copy(alpha = 0.6f)
            val opacity70 = Color(0xFF42BE65).copy(alpha = 0.7f)
            val opacity80 = Color(0xFF42BE65).copy(alpha = 0.8f)
            val opacity90 = Color(0xFF42BE65).copy(alpha = 0.9f)
            val opacity100 = Color(0xFF42BE65)
        }

        object Orange {
            val opacity10 = Color(0xFFFF832B).copy(alpha = 0.1f)
            val opacity20 = Color(0xFFFF832B).copy(alpha = 0.2f)
            val opacity30 = Color(0xFFFF832B).copy(alpha = 0.3f)
            val opacity40 = Color(0xFFFF832B).copy(alpha = 0.4f)
            val opacity50 = Color(0xFFFF832B).copy(alpha = 0.5f)
            val opacity60 = Color(0xFFFF832B).copy(alpha = 0.6f)
            val opacity70 = Color(0xFFFF832B).copy(alpha = 0.7f)
            val opacity80 = Color(0xFFFF832B).copy(alpha = 0.8f)
            val opacity90 = Color(0xFFFF832B).copy(alpha = 0.9f)
            val opacity100 = Color(0xFFFF832B)
        }

        object Red {
            val opacity10 = Color(0xFFFA4D56).copy(alpha = 0.1f)
            val opacity20 = Color(0xFFFA4D56).copy(alpha = 0.2f)
            val opacity30 = Color(0xFFFA4D56).copy(alpha = 0.3f)
            val opacity40 = Color(0xFFFA4D56).copy(alpha = 0.4f)
            val opacity50 = Color(0xFFFA4D56).copy(alpha = 0.5f)
            val opacity60 = Color(0xFFFA4D56).copy(alpha = 0.6f)
            val opacity70 = Color(0xFFFA4D56).copy(alpha = 0.7f)
            val opacity80 = Color(0xFFFA4D56).copy(alpha = 0.8f)
            val opacity90 = Color(0xFFFA4D56).copy(alpha = 0.9f)
            val opacity100 = Color(0xFFFA4D56)
        }

        object Grey {
            val tint10 = Color(0xFFF2F4F8)
            val tint20 = Color(0xFFDDE1E6)
            val tint30 = Color(0xFFC1C7CD)
            val tint40 = Color(0xFFA2A9B0)
            val tint50 = Color(0xFF878D96)
            val tint60 = Color(0xFF697077)
            val tint70 = Color(0xFF4D5358)
            val tint80 = Color(0xFF343A3F)
            val tint90 = Color(0xFF21272A)
            val tint100 = Color(0xFF121619)
        }

        object Black {
            val opacity10 = Color(0xFF000000).copy(alpha = 0.1f)
            val opacity20 = Color(0xFF000000).copy(alpha = 0.2f)
            val opacity30 = Color(0xFF000000).copy(alpha = 0.3f)
            val opacity40 = Color(0xFF000000).copy(alpha = 0.4f)
            val opacity50 = Color(0xFF000000).copy(alpha = 0.5f)
            val opacity60 = Color(0xFF000000).copy(alpha = 0.6f)
            val opacity70 = Color(0xFF000000).copy(alpha = 0.7f)
            val opacity80 = Color(0xFF000000).copy(alpha = 0.8f)
            val opacity90 = Color(0xFF000000).copy(alpha = 0.9f)
            val opacity100 = Color(0xFF000000)
        }

        object White {
            val opacity10 = Color(0xFFFFFFFF).copy(alpha = 0.1f)
            val opacity20 = Color(0xFFFFFFFF).copy(alpha = 0.2f)
            val opacity30 = Color(0xFFFFFFFF).copy(alpha = 0.3f)
            val opacity40 = Color(0xFFFFFFFF).copy(alpha = 0.4f)
            val opacity50 = Color(0xFFFFFFFF).copy(alpha = 0.5f)
            val opacity60 = Color(0xFFFFFFFF).copy(alpha = 0.6f)
            val opacity70 = Color(0xFFFFFFFF).copy(alpha = 0.7f)
            val opacity80 = Color(0xFFFFFFFF).copy(alpha = 0.8f)
            val opacity90 = Color(0xFFFFFFFF).copy(alpha = 0.9f)
            val opacity100 = Color(0xFFFFFFFF)
        }
    }
}