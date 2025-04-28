package net.alminoris.aestheticedges.util.helper;

public class ModJsonTemplates
{
    public static String YAXIS_ROTATED_BLOCKSTATE_TEMPLATE = """
            {
              "variants": {
                "facing=north": { "model": "aestheticedges:block/NAME" },
                "facing=south": { "model": "aestheticedges:block/NAME", "y": 180 },
                "facing=west": { "model": "aestheticedges:block/NAME", "y": 270 },
                "facing=east": { "model": "aestheticedges:block/NAME", "y": 90 }
              }
            }
            """;

    public static String CURBSTONE_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [16, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [16, 8, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 4],
            			"to": [16, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"up": {"uv": [16, 10, 0, 6], "texture": "#0"},
            				"down": {"uv": [16, 6, 0, 10], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String CURBSTONE_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [16, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [16, 8, 0, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4],
            			"to": [16, 8, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"east": {"uv": [4, 0, 16, 8], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"west": {"uv": [4, 0, 16, 8], "texture": "#0"},
            				"up": {"uv": [12, 12, 0, 8], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [12, 8, 0, 12], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 4],
            			"to": [12, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
            			"faces": {
            				"north": {"uv": [0, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"up": {"uv": [12, 10, 0, 6], "texture": "#0"},
            				"down": {"uv": [12, 6, 0, 10], "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 8],
            			"to": [12, 5.5, 16],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 8]},
            			"faces": {
            				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"up": {"uv": [8, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [8, 6, 0, 10], "rotation": 270, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String CURBSTONE_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"texture_size": [32, 32],
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [12, 0, 0],
            			"to": [16, 8, 4],
            			"faces": {
            				"north": {"uv": [12, 0, 16, 8], "texture": "#0"},
            				"east": {"uv": [8, 0, 12, 8], "texture": "#0"},
            				"south": {"uv": [4, 0, 8, 8], "texture": "#0"},
            				"west": {"uv": [0, 0, 4, 8], "texture": "#0"},
            				"up": {"uv": [4, 12, 0, 8], "texture": "#0"},
            				"down": {"uv": [8, 8, 4, 12], "texture": "#0"}
            			}
            		},
            		{
            			"from": [12, 0, 4],
            			"to": [16, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
            			"faces": {
            				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"east": {"uv": [4, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [0, 0, 4, 6], "texture": "#0"},
            				"west": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"up": {"uv": [4, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [8, 6, 4, 10], "rotation": 270, "texture": "#0"}
            			}
            		},
            		{
            			"from": [8, 0, 0],
            			"to": [12, 5.5, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 0]},
            			"faces": {
            				"north": {"uv": [12, 0, 16, 6], "texture": "#0"},
            				"east": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"south": {"uv": [8, 0, 12, 6], "texture": "#0"},
            				"west": {"uv": [0, 0, 8, 6], "texture": "#0"},
            				"up": {"uv": [8, 10, 0, 6], "rotation": 90, "texture": "#0"},
            				"down": {"uv": [16, 6, 8, 10], "rotation": 270, "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 3, 2],
            			"faces": {
            				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
            				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 2], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 2], "texture": "#0"}
            			}
            		},
            		{
            			"from": [0, 0, 2],
            			"to": [16, 1, 3.5],
            			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 1.5]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
            			}
            		},
            		{
            			"from": [-0.025, -0.1, 2.1],
            			"to": [16.025, 2.4, 3.1],
            			"rotation": {"angle": -22.5, "axis": "x", "origin": [0.1, -0.1, 1.1]},
            			"faces": {
            				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
            				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
            				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
            				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
            				"down": {"uv": [0, 0, 16, 1], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 0.001, 0],
             			"to": [16, 3.001, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0.1, 0]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 2], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 2], "texture": "#0"}
             			}
             		},
             		{
             			"from": [-0.025, -0.1, 2.1],
             			"to": [15.925, 2.4, 3.1],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [0.1, -0.1, 1.1]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0.001, 2],
             			"to": [15.9, 1.001, 3.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 1.5]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1.5], "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1.5], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.975, 0, -0.025],
             			"to": [15.975, 3.0001, 15.975],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 2], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 2], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.26162, 0.28522, 0.25],
             			"to": [14.26162, 2.78522, 16],
             			"rotation": {"angle": -22.5, "axis": "z", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.475, 0.0001, 0.075],
             			"to": [13.975, 1.0001, 15.975],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.16444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 16, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 16, 1.5], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 16, 1.5], "rotation": 270, "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String BASEBOARD_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [14, 0, 0],
             			"to": [16, 3, 2],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.1, 1.06444, 7.975]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 3], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.22329, 0.47799, -0.0001],
             			"to": [14.22329, 2.97799, 1.9999],
             			"rotation": {"angle": -22.5, "axis": "z", "origin": [13.59627, 1.06449, 1.41235]},
             			"faces": {
             				"north": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 1], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 1], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [12.475, 0.0001, -0.0002],
             			"to": [14.075, 1.0001, 3.4998],
             			"rotation": {"angle": 0, "axis": "y", "origin": [13.59627, 1.06449, 1.41235]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 3, 1.5], "rotation": 90, "texture": "#0"},
             				"down": {"uv": [0, 0, 3, 1.5], "rotation": 270, "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.98382, 0.47799, 1.475],
             			"to": [16.00882, 2.87799, 2.475],
             			"rotation": {"angle": -22.5, "axis": "x", "origin": [14.55882, 1.72799, 1.93533]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"east": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 2.5], "texture": "#0"},
             				"west": {"uv": [0, 0, 1, 2.5], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 1], "texture": "#0"}
             			}
             		},
             		{
             			"from": [13.975, -0.0001, 2],
             			"to": [16.001, 1, 3.5],
             			"rotation": {"angle": 0, "axis": "y", "origin": [14.59627, 1.06449, 2.31235]},
             			"faces": {
             				"north": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"east": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"south": {"uv": [0, 0, 2, 1], "texture": "#0"},
             				"west": {"uv": [0, 0, 1.5, 1], "texture": "#0"},
             				"up": {"uv": [0, 0, 2, 2.1], "texture": "#0"},
             				"down": {"uv": [0, 0, 2, 2.1], "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
             	"texture_size": [32, 32],
             	"textures": {
             		"0": "NAME",
             		"particle": "NAME"
             	},
             	"elements": [
             		{
             			"from": [0, 0, 0],
             			"to": [16, 16, 5],
             			"faces": {
             				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"east": {"uv": [0, 0, 5, 16], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
             				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
             				"up": {"uv": [16, 13, 0, 8], "texture": "#0"},
             				"down": {"uv": [16, 8, 0, 13], "texture": "#0"}
             			}
             		},
             		{
             			"from": [0, 0, 5],
             			"to": [16, 13.5, 8],
             			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
             			"faces": {
             				"north": {"uv": [0, 0, 16, 14], "texture": "#0"},
             				"east": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"south": {"uv": [0, 0, 16, 14], "texture": "#0"},
             				"west": {"uv": [0, 0, 3, 14], "texture": "#0"},
             				"up": {"uv": [16, 9, 0, 6], "texture": "#0"},
             				"down": {"uv": [16, 6, 0, 9], "texture": "#0"}
             			}
             		}
             	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_INNER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
               	"texture_size": [32, 32],
               	"textures": {
               		"0": "NAME",
               		"particle": "NAME"
               	},
               	"elements": [
               		{
               			"from": [0, 0, 0],
               			"to": [16, 16, 5],
               			"faces": {
               				"north": {"uv": [0, 0, 16, 16], "texture": "#0"},
               				"east": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"south": {"uv": [0, 0, 16, 16], "texture": "#0"},
               				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"up": {"uv": [16, 13, 0, 8], "texture": "#0"},
               				"down": {"uv": [16, 8, 0, 13], "texture": "#0"}
               			}
               		},
               		{
               			"from": [11, 0, 5],
               			"to": [16, 16, 16],
               			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
               			"faces": {
               				"north": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"east": {"uv": [5, 0, 16, 16], "texture": "#0"},
               				"south": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"west": {"uv": [5, 0, 16, 16], "texture": "#0"},
               				"up": {"uv": [11, 13, 0, 8], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [11, 8, 0, 13], "rotation": 270, "texture": "#0"}
               			}
               		},
               		{
               			"from": [0, 0, 5],
               			"to": [11, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [0, 0, 4]},
               			"faces": {
               				"north": {"uv": [0, 0, 11, 14], "texture": "#0"},
               				"east": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"south": {"uv": [0, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"up": {"uv": [11, 9, 0, 6], "texture": "#0"},
               				"down": {"uv": [11, 6, 0, 9], "texture": "#0"}
               			}
               		},
               		{
               			"from": [8, 0, 8],
               			"to": [11, 13.5, 16],
               			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 8]},
               			"faces": {
               				"north": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"east": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"up": {"uv": [8, 9, 0, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [8, 6, 0, 9], "rotation": 270, "texture": "#0"}
               			}
               		}
               	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String HIGH_CURBSTONE_OUTER_MODEL_TEMPLATE = """
            {
            	"credit": "Made with Blockbench",
               	"texture_size": [32, 32],
               	"textures": {
               		"0": "NAME",
               		"particle": "NAME"
               	},
               	"elements": [
               		{
               			"from": [11, 0, 0],
               			"to": [16, 16, 5],
               			"faces": {
               				"north": {"uv": [11, 0, 16, 16], "texture": "#0"},
               				"east": {"uv": [7, 0, 12, 16], "texture": "#0"},
               				"south": {"uv": [3, 0, 8, 16], "texture": "#0"},
               				"west": {"uv": [0, 0, 5, 16], "texture": "#0"},
               				"up": {"uv": [5, 13, 0, 8], "texture": "#0"},
               				"down": {"uv": [8, 8, 3, 13], "texture": "#0"}
               			}
               		},
               		{
               			"from": [11, 0, 5],
               			"to": [16, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [16, 0, 4]},
               			"faces": {
               				"north": {"uv": [8, 0, 12, 6], "texture": "#0"},
               				"east": {"uv": [5, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [0, 0, 5, 14], "texture": "#0"},
               				"west": {"uv": [13, 0, 16, 14], "texture": "#0"},
               				"up": {"uv": [4, 11, 1, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [7, 6, 4, 11], "rotation": 270, "texture": "#0"}
               			}
               		},
               		{
               			"from": [8, 0, 0],
               			"to": [11, 13.5, 8],
               			"rotation": {"angle": 0, "axis": "y", "origin": [12, 0, 0]},
               			"faces": {
               				"north": {"uv": [12, 0, 15, 14], "texture": "#0"},
               				"east": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"south": {"uv": [8, 0, 11, 14], "texture": "#0"},
               				"west": {"uv": [0, 0, 8, 14], "texture": "#0"},
               				"up": {"uv": [8, 9, 0, 6], "rotation": 90, "texture": "#0"},
               				"down": {"uv": [16, 6, 8, 9], "rotation": 270, "texture": "#0"}
               			}
               		}
               	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
            	"textures": {
            		"0": "NAME",
            		"particle": "NAME"
            	},
            	"elements": [
            		{
            			"from": [0, 0, 0],
            			"to": [16, 8, 8],
            			"rotation": {"angle": 0, "axis": "y", "origin": [8, 4, 4]},
            			"faces": {
            				"north": {"uv": [0, 8, 16, 16], "texture": "#0"},
            				"east": {"uv": [4, 4, 12, 12], "texture": "#0"},
            				"south": {"uv": [0, 8, 16, 16], "texture": "#0"},
            				"west": {"uv": [4, 4, 12, 12], "texture": "#0"},
            				"up": {"uv": [16, 8, 0, 0], "texture": "#0"},
            				"down": {"uv": [16, 0, 0, 8], "texture": "#0"}
            			}
            		}
            	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_INNER_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
              	"textures": {
              		"0": "NAME",
              		"particle": "NAME"
              	},
              	"elements": [
              		{
              			"from": [0, 0, 0],
              			"to": [16, 8, 8],
              			"rotation": {"angle": 0, "axis": "y", "origin": [8, 4, 4]},
              			"faces": {
              				"north": {"uv": [0, 8, 16, 16], "texture": "#0"},
              				"east": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"south": {"uv": [0, 8, 16, 16], "texture": "#0"},
              				"west": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"up": {"uv": [0, 0, 16, 8], "texture": "#0"},
              				"down": {"uv": [0, 0, 16, 8], "texture": "#0"}
              			}
              		},
              		{
              			"from": [8, 0, 8],
              			"to": [16, 8, 16],
              			"rotation": {"angle": 0, "axis": "y", "origin": [12, 4, 12]},
              			"faces": {
              				"north": {"uv": [0, 0, 8, 8], "texture": "#missing"},
              				"east": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"south": {"uv": [0, 0, 8, 8], "texture": "#0"},
              				"west": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"down": {"uv": [0, 8, 8, 16], "texture": "#0"}
              			}
              		}
              	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String SIMPLE_CURB_OUTER_MODEL_TEMPLATE = """
            {
                "credit": "Made with Blockbench",
              	"textures": {
              		"0": "NAME",
              		"particle": "NAME"
              	},
              	"elements": [
              		{
              			"from": [8, 0, 0],
              			"to": [16, 8, 8],
              			"rotation": {"angle": 0, "axis": "y", "origin": [12, 4, 4]},
              			"faces": {
              				"north": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"east": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"south": {"uv": [0, 8, 8, 16], "texture": "#0"},
              				"west": {"uv": [8, 0, 16, 8], "texture": "#0"},
              				"up": {"uv": [8, 8, 16, 16], "texture": "#0"},
              				"down": {"uv": [8, 0, 16, 8], "texture": "#0"}
              			}
              		}
              	],
            	"display": {
            		"thirdperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"thirdperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_righthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"firstperson_lefthand": {
            			"translation": [0, 2.25, 1.25],
            			"scale": [0.5, 0.5, 0.5]
            		},
            		"gui": {
            			"rotation": [20, -45, 0],
            			"translation": [-1.5, 1.5, 0],
            			"scale": [0.6, 0.6, 0.6]
            		},
            		"fixed": {
            			"rotation": [180, 0, 180],
            			"translation": [0, 2.25, -2.75],
            			"scale": [0.7, 0.7, 0.7]
            		}
            	}
            }
            """;

    public static String STONECUTTING_RECIPE = """
            {
              "type": "minecraft:stonecutting",
              "ingredient": {
                "item": "INGREDIENT_NAME"
              },
              "result": {
                "count": COUNT,
                "id": "aestheticedges:OUTPUT_NAME"
              }
            }
            """;
}