.class final Lfr$a;
.super Lfq$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# direct methods
.method constructor <init>(Lfq$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lfq$a;-><init>(Lfq$a;)V

    return-void
.end method


# virtual methods
.method public final newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, Lfr;

    invoke-direct {v0, p0, p1}, Lfr;-><init>(Lfq$a;Landroid/content/res/Resources;)V

    return-object v0
.end method
