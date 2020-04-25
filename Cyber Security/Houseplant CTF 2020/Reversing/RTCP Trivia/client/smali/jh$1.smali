.class final Ljh$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljh;


# direct methods
.method constructor <init>(Ljh;)V
    .locals 0

    iput-object p1, p0, Ljh$1;->a:Ljh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Ljh$1;->a:Ljh;

    invoke-virtual {p1}, Ljh;->invalidateSelf()V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    iget-object p1, p0, Ljh$1;->a:Ljh;

    invoke-virtual {p1, p2, p3, p4}, Ljh;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    iget-object p1, p0, Ljh$1;->a:Ljh;

    invoke-virtual {p1, p2}, Ljh;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method
